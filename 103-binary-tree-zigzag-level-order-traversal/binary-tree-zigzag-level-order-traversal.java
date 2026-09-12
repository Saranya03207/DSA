/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> l=new ArrayList<>();
        if(root==null){
            return l;
        }

        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        boolean reverse=false;
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> level=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode temp=q.poll();

                level.add(temp.val);

                if(temp.left!=null){
                    q.offer(temp.left);
                }if(temp.right!=null){
                    q.offer(temp.right);
                }
            }
            if(reverse){
                Collections.reverse(level);
            }
            l.add(level);

            reverse=!reverse;
        }
        return l;
    }
}