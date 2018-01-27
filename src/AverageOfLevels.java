import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//list.set(int index,E element) replaces the element at the specified position in this list with the specified element
//__>DFS
public class AverageOfLevels {
    //t refers to the current node,i refers to the current level,sum refers to the current sum,count refers to the count of level i
    public void average(TreeNode t, int i, List<Double> sum,List<Integer> count){
        if(t == null)
            return;
        if(i < sum.size()){
            sum.set(i,sum.get(i) + t.val);
            count.set(i,count.get(i) + 1);
        }else{
            sum.add(1.0*t.val);
            count.add(1);
        }
        average(t.left,i + 1,sum ,count);
        average(t.right,i + 1,sum ,count);
    }
    public List<Double> averageOfLevels(TreeNode root){
        List<Integer> count = new ArrayList<>();
        List<Double> res = new ArrayList<>();
        average(root,0,res,count);
        for (int i = 0; i < res.size(); i++) {
            res.set(i,res.get(i)/count.get(i));
        }
        return res;
    }
}
//BFS
class BFS{
    public List<Double> averageOfLevels(TreeNode root){
        List<Double> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            long sum = 0,count = 0;
            //an empty temp queue
            Queue<TreeNode> temp = new LinkedList<>();
            while(!queue.isEmpty()){
                TreeNode n = queue.remove();
                sum += n.val;
                count++;
                if (n.left != null)
                    temp.add(n.left);
                if (n.right != null)
                    temp.add(n.right);
            }
            queue = temp;
            res.add(sum*1.0 / count);
        }
        return res;
    }
}



