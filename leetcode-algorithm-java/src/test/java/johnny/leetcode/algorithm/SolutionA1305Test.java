package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import johnny.algorithm.common.TreeNode;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionA1305Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("getAllElements");
        SolutionA1305 instance = new SolutionA1305();

        List<Integer> expect1 = ListUtil.buildList(new Integer[]{0,1,1,2,3,4});
        assertEquals(expect1, instance.getAllElements(TreeNode.createInstance("2,1,4"), TreeNode.createInstance("1,0,3")));

        List<Integer> expect2 = ListUtil.buildList(new Integer[]{-10,0,0,1,2,5,7,10});
        assertEquals(expect2, instance.getAllElements(TreeNode.createInstance("0,-10,10"), TreeNode.createInstance("5,1,7,0,2")));

        List<Integer> expect3 = ListUtil.buildList(new Integer[]{0,1,2,5,7});
        assertEquals(expect3, instance.getAllElements(null, TreeNode.createInstance("5,1,7,0,2")));

        List<Integer> expect4 = ListUtil.buildList(new Integer[]{-10,0,10});
        assertEquals(expect4, instance.getAllElements(TreeNode.createInstance("0,-10,10"), null));

        List<Integer> expect5 = ListUtil.buildList(new Integer[]{1,1,8,8});
        assertEquals(expect5, instance.getAllElements(TreeNode.createInstance("1,#,8"), TreeNode.createInstance("8,1,#")));

        List<Integer> expect6 = ListUtil.buildList(new Integer[]{0,6,17,20,57,59,60,63,74,90,95,97});
        assertEquals(expect6, instance.getAllElements(TreeNode.createInstance("0,null,59,57,90"), TreeNode.createInstance("60,17,74,6,20,63,97,null,null,null,null,null,null,95,null")));

        List<Integer> expect7 = ListUtil.buildList(new Integer[]{2,7,8,10,21,34,50,58,64,66,68,73,74,80,84,85,87,89,90,92,99,100});
        assertEquals(expect7, instance.getAllElements(TreeNode.createInstance("99,90,null,8,null,7,85,null,null,null,87"), TreeNode.createInstance("50,2,73,null,34,58,80,21,null,null,64,74,92,10,null,null,68,null,null,89,100,null,null,66,null,84,null,null,null,null,null")));


    }

}
