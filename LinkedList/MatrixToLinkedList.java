package LinkedList;

public class MatrixToLinkedList {
    static Node arrNode[][];
    
    static class Node {
        int data;
        Node right;
        Node down;
    }
    
    static void SetNodeValues(int arr[][], int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arrNode[i][j] = new Node();
                arrNode[i][j].data = arr[i][j];
            }
        }
    }
    
    static void SetNodeReferences(int arr[][], int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Set right pointer
                if (j == n - 1) {
                    arrNode[i][j].right = null;
                } else {
                    arrNode[i][j].right = arrNode[i][j + 1];
                }
                
                // Set down pointer
                if (i == m - 1) {
                    arrNode[i][j].down = null;
                } else {
                    arrNode[i][j].down = arrNode[i + 1][j];
                }
            }
        }
    }
    
    static void display() {
        Node row = arrNode[0][0];
        while (row != null) {
            Node col = row;
            while (col != null) {
                System.out.print(col.data + " ");
                col = col.right;
            }
            System.out.println();
            row = row.down;
        }
    }
    
    public static void main(String args[]) {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int m = 3, n = 3;
        arrNode = new Node[m][n];
        SetNodeValues(arr, m, n);
        SetNodeReferences(arr, m, n);
        display();
    }
}