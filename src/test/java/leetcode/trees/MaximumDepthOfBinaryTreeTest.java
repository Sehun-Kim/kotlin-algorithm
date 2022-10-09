package leetcode.trees;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumDepthOfBinaryTreeTest extends TreeBaseTest {

    @Test
    void test1() {
        // given
        TreeNode root = generateBinaryTreeByList(new ArrayList(Arrays.asList(3, 9, 20, null, null, 15, 7)));
        List<Integer> list = new ArrayList<>();
        printTreeAndAddToList(root, true, list);

        // when
        int result = new MaximumDepthOfBinaryTree().maxDepth(root);

        // then
        assertEquals(3, result);
    }

    @Test
    void test2() {
        // given
        TreeNode root = generateBinaryTreeByList(new ArrayList(Arrays.asList(1, null, 2)));
        List<Integer> list = new ArrayList<>();
        printTreeAndAddToList(root, true, list);

        // when
        int result = new MaximumDepthOfBinaryTree().maxDepth(root);

        // then
        assertEquals(2, result);
    }

}