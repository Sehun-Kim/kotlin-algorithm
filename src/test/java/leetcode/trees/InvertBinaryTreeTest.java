package leetcode.trees;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InvertBinaryTreeTest extends TreeBaseTest {

    @Test
    void test1() {
        // given
        TreeNode tree = generateTree(4, 2, 7, 1, 3, 6, 9);

        // when
        TreeNode result = new InvertBinaryTree().invertTree(tree);
        List<Integer> list = new ArrayList<>();
        printTreeAndAddToList(result, true, list);

        // then
        List<Integer> expected = new ArrayList(Arrays.asList(4, 7, 2, 9, 6, 3, 1));
        assertEquals(expected, list);
    }

    @Test
    void test2() {
        // given
        TreeNode tree = generateTree(2, 1, 3);

        // when
        TreeNode result = new InvertBinaryTree().invertTree(tree);
        List<Integer> list = new ArrayList<>();
        printTreeAndAddToList(result, true, list);

        // then
        List<Integer> expected = new ArrayList(Arrays.asList(2, 3, 1));
        assertEquals(expected, list);
    }

    @Test
    void test3() {
        // given
        TreeNode tree = generateTree();

        // when
        TreeNode result = new InvertBinaryTree().invertTree(tree);
        List<Integer> list = new ArrayList<>();
        printTreeAndAddToList(result, true, list);

        // then
        List<Integer> expected = new ArrayList(Arrays.asList());
        assertEquals(expected, list);
    }

}