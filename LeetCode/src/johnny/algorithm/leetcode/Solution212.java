package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Word Search II.
 * 
 * Given a 2D board and a list of words from the dictionary, find all words in 
 * the board.
 * 
 * Each word must be constructed from letters of sequentially adjacent cell,
 * where "adjacent" cells are those horizontally or vertically neighboring. 
 * The same letter cell may not be used more than once in a word.
 * 
 * For example,
 * Given words = ["oath","pea","eat","rain"] and board =
 * 
 * [
 *   ['o','a','a','n'],
 *   ['e','t','a','e'],
 *   ['i','h','k','r'],
 *   ['i','f','l','v']
 * ]
 * Return ["eat","oath"].
 * Note:
 * You may assume that all inputs are consist of lowercase letters a-z.
 *  
 * @author Johnny
 */
public class Solution212 {
    //http://www.programcreek.com/2014/06/leetcode-word-search-ii-java/
    //https://discuss.leetcode.com/topic/33246/java-15ms-easiest-solution-100-00/2
    public List<String> findWords(char[][] board, String[] words) {
        List<String> res = new ArrayList<String>();
        if (board == null || board.length == 0 || board[0].length == 0) {
            return res;
        }
        if (words == null || words.length == 0) {
            return res;
        }
        TrieNode root = buildTrie(words);
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                dfs(board, i, j, root, res);
            }
        }
        return res;
    }

    public void dfs(char[][] board, int i, int j, TrieNode p, List<String> res) {
        char c = board[i][j];
        if(c == '#' || p.next[c - 'a'] == null) return;
        p = p.next[c - 'a'];
        if(p.word != null) {   // found one
            res.add(p.word);
            p.word = null;     // de-duplicate
        }

        board[i][j] = '#';
        if(i > 0) dfs(board, i - 1, j ,p, res); 
        if(j > 0) dfs(board, i, j - 1, p, res);
        if(i < board.length - 1) dfs(board, i + 1, j, p, res); 
        if(j < board[0].length - 1) dfs(board, i, j + 1, p, res); 
        board[i][j] = c;
    }

    public TrieNode buildTrie(String[] words) {
        TrieNode root = new TrieNode();
        for(String w : words) {
            TrieNode p = root;
            for(char c : w.toCharArray()) {
                int i = c - 'a';
                if(p.next[i] == null) p.next[i] = new TrieNode();
                p = p.next[i];
           }
           p.word = w;
        }
        return root;
    }

    class TrieNode {
        TrieNode[] next = new TrieNode[26];
        String word;
    }

    //dfs
    public List<String> findWords3(char[][] board, String[] words) {
        List<String> res = new ArrayList<String>();
        if (board == null || board.length == 0 || board[0].length == 0) {
            return res;
        }
        if (words == null || words.length == 0) {
            return res;
        }
        
        int m = board.length;
        int n = board[0].length;
        
        for (String word : words) {
            char[] w = word.toCharArray();
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (board[i][j] == word.charAt(0)) {
                        boolean[][] visited = new boolean[m][n];
                        if (dfs(board, i, j, w, 0, visited)){
                            res.add(word);
                        }
                    }
                }
            }
        }
        return res;
    }
    
    private boolean dfs(char[][] board, int i, int j, char[] word, int pos, boolean[][] visited) {
        if (pos == word.length) {
            return true;
        }
        int m = board.length;
        int n = board[0].length;
        if (i < 0 || i >= m || j < 0 || j >= n || visited[i][j]) {
            return false;
        }

        if (board[i][j] != word[pos]) {
            return false;
        }

        visited[i][j] = true;
        if (dfs(board, i + 1, j, word, pos + 1, visited)){
            return true;
        }
        if (dfs(board, i - 1, j, word, pos + 1, visited)){
            return true;
        }
        if (dfs(board, i, j + 1, word, pos + 1, visited)){
            return true;
        }
        if (dfs(board, i, j - 1, word, pos + 1, visited)){
            return true;
        }
        visited[i][j] = false;
        return false;
    }
    
    public List<String> findWords2(char[][] board, String[] words) {        
	ArrayList<String> result = new ArrayList<String>();
        if (board == null || board.length == 0 || board[0].length == 0) {
            return result;
        }
	int m = board.length;
	int n = board[0].length;
 
	for (String word : words) {
            boolean flag = false;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    char[][] newBoard = new char[m][n];
                    for (int x = 0; x < m; x++)
                        for (int y = 0; y < n; y++)
                            newBoard[x][y] = board[x][y];

                    if (dfs(newBoard, word, i, j, 0)) {
                        flag = true;
                    }
                }
            }
            if (flag) {
                    result.add(word);
            }
	}
 
	return result;
    }
 
    private boolean dfs(char[][] board, String word, int i, int j, int k) {
        int m = board.length;
        int n = board[0].length;

        if (i < 0 || j < 0 || i >= m || j >= n || k > word.length() - 1) {
            return false;
        }

        if (board[i][j] == word.charAt(k)) {
            char temp = board[i][j];
            board[i][j] = '#';

            if (k == word.length() - 1) {
                return true;
            } else if (dfs(board, word, i - 1, j, k + 1)
                        || dfs(board, word, i + 1, j, k + 1)
                        || dfs(board, word, i, j - 1, k + 1)
                        || dfs(board, word, i, j + 1, k + 1)) {
                board[i][j] = temp;
                return true;
            }
        } else {
            return false;
        }

        return false;
    }
}
