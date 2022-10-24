/**
 *
 * @author stroz
 */
public class MatrixDrehen {
    
    public static char[][] dreheRechts(char[][] feld){
        
        int M = feld.length;
        int N = feld[0].length;
        
        char[][] feldneu = new char[N][M];
        
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                feldneu[j][M - 1 - i] = feld[i][j];
            }
        }
        
        
        
        return feldneu;
    }
    
    public static void alsString(char[][] matrix){
        for (int i = 0; i < matrix.length; i = i + 1) {
            for (int j = 0; j < matrix[i].length; j = j + 1) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        char[][] test = { 
                        {'a', 'b', 'c'},
                        {'d', 'e', 'f'},
                        };

        alsString(test);
        System.out.println("");
        
        alsString(dreheRechts(test));
        
        System.out.println(test.length);
        System.out.println(test[0].length);
        System.out.println("");
        System.out.println(dreheRechts(test).length);
        System.out.println(dreheRechts(test)[0].length);
        
    }
}
