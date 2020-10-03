class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        return cSum(candidates, target, 0, candidates.length);
    }
    public List<List<Integer>> cSum(int[] candidates, int target, int start, int end){
        //System.out.println("Candidates : "+java.util.Arrays.asList(java.util.Arrays.stream(candidates).boxed().toArray(Integer[]::new))+", target="+target);
        java.util.List<java.util.List<Integer>> result = new java.util.ArrayList<>();
        for(int i = start; i<candidates.length ; i++){
            int loopvar = target/candidates[i];
            if(target%candidates[i]==0){
                result.add(java.util.Collections.nCopies(loopvar,candidates[i]));
                //System.out.println("Adding "+loopvar+" copies of "+candidates[i]);
                loopvar-=1;
            }
            java.util.List<Integer> element = new java.util.ArrayList<>();
            for(int j = 0; j < loopvar ; j++){
                element.add(candidates[i]);
                //System.out.println("Calling subResult for "+candidates[i]+", i="+i+", j="+j);
                int newTarget = target-(candidates[i]*(j+1));
                java.util.List<java.util.List<Integer>> subResult = cSum(candidates, newTarget, i+1, candidates.length);
                //System.out.println("SubResult : "+subResult+", newTarget="+newTarget);
                for(java.util.List<Integer> res : subResult){
                    if(!res.isEmpty()){
                        java.util.List<Integer> e = new java.util.ArrayList<>();
                        e.addAll(element);
                        e.addAll(res);
                        result.add(e);
                    }                    
                }
            }
        }
        //System.out.println("Result : "+result+", target="+target);
        return result;
    }
}