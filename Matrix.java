
public class Matrix {


    public static int[][] fillTheMatrix (int[][] mtx){

        for (int i = 0; i < mtx.length; i++) {

            for (int j = 0; j < mtx[i].length; j++) {
                mtx[i][j] = 0;
            }

        }
        return mtx;
    }

    public static boolean randomFillTheMatrix (int[][] mtx){
        for (int i = 0; i < mtx.length; i++) {
            for (int j = 0; j < mtx[0].length; j++) {
                mtx[i][j] = (int)(Math.random() * 10);
            }
        }
        return true;
    }


    public static boolean printTheMatrix (int[][] mtx){
        for (int i = 0; i < mtx.length; i++) {
            for (int j = 0; j < mtx[i].length; j++) {
                System.out.print(mtx[i][j] + " ");
            }
            System.out.print("\n");
        }
        return true;
    }

    public static boolean swapZeroToOneInPerimetr (int [][] mtx){
        for (int i = 0; i <mtx.length ; i += mtx.length - 1) {
            for (int j = 0; j <mtx[i].length ; j++) {
                mtx[i][j] = 1;
            }
        }
        for (int i = 0; i < mtx.length; i++) {
            for (int j = 0; j < 1; j++) {
                mtx[i][j] = 1;
            }
        }
        for (int i = 0; i < mtx.length; i++) {
            for (int j = mtx[i].length - 1; j > mtx[i].length - 2 ; j--) {
                mtx[i][j] = 1;
            }
        }
        return true;
    }

    public static boolean userMatrix (int[][] mtx){
        int countNumbers = 0;

        for (int i = 0; i < mtx.length; i++) {
            for (int j = 0; j <mtx[i].length ; j++) {
                mtx[i][j] = 1;
                countNumbers++;
            }
        }
        for (int i = 0; i < mtx.length; i++) {
            for (int j = 0; j <mtx[i].length ; j++) {
                System.out.print(mtx[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Количество 1 в массиве равно: " + countNumbers);

        return true;
    }


    public static int[][] multiplyMatrix (int[][] m1, int[][] m2){
        int rowLengthMat1 = m1.length;
        int columnLengthMat2 = m2[0].length;

        if (rowLengthMat1 != columnLengthMat2){
            System.out.println("Imposible to multiply");
            return null;
        }

        // строк как у первой - столбцов как у второй
        int[][] mResult = new int[m1.length][m2[0].length];

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                for (int k = 0; k < m1[i].length; k++) {
                    mResult[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return mResult;
    }

    public static int[][] multiplyMatrixToInteger (int[][] mtx, int num){
        int[][] resultMtx = new int[mtx.length][mtx[0].length];
        for (int i = 0; i < mtx.length; i++) {
            for (int j = 0; j < mtx[i].length ; j++) {
                resultMtx[i][j] = mtx[i][j] * num;
            }
        }
        return resultMtx;
    }

    public static int[][] sumMatrix (int[][] m1, int[][] m2){
        int [][] resultM = new int[m1.length][m1[0].length];

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                resultM[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return resultM;
    }

    public static int[][] exponentialMatrix (int[][] mtx, int num){
        int[][] resultMtx = new int[mtx.length][mtx[0].length];
        for (int i = 0; i < mtx.length; i++) {
            for (int j = 0; j < mtx[0].length; j++) {
                resultMtx[i][j] = 1;
                for (int k = num; k > 0; k--) {
                    resultMtx[i][j] *= mtx[i][j];
                }
            }
        }
        return resultMtx;
    }


    public static boolean kakaiatoFigneaSDiagonaliami (int [][] mtx){
        if (mtx.length != mtx[0].length){
            System.out.println("С данной матрицей невозможно выполнить эту операцию, так как она не квадратная :");
            return false;
        }

        mtx = new int[10][10];

        for (int i = 0; i < mtx.length; i++) {
            for (int j = 0; j < mtx[i].length; j++) {
                if (i == j){
                    mtx[i][j] = 1;
                }
                if (j == mtx.length - 1 - i){
                    mtx[i][j] = 2;
                }
                if ( (i + 1) == (mtx.length - 2 - j) ){
                    mtx[i][j] = 3;
                }
            }
        }

        printTheMatrix(mtx);

//        for (int i = 0; i < mtx.length; i++) {
//            for (int j = i; j < i + 1; j++) {
//                mtx[i][j] = 1;
//            }
//        }
//
//        int num = mtx[0].length - 1;
//        for (int i = 0; i < mtx.length; i++) {
//            mtx[i][num - i] = 2;
//            }

       return true;
    }

    public static boolean transposeMatrixByMainDiogonal (int[][] mtx){

        if (mtx.length == mtx[0].length) {
            int[][] transM = new int[mtx.length][mtx[0].length];
            for (int i = 0; i < mtx.length; i++) {
                for (int j = 0; j < transM.length; j++) {
                    transM[j][i] = mtx[i][j];
                }
            }
            printTheMatrix(transM);
        }

        if (mtx.length > mtx[0].length){
            int[][] transM = new int[mtx[0].length][mtx.length];
            for (int i = 0; i < mtx[i].length; i++) {
                for (int j = 0; j < mtx.length; j++) {
                    transM[i][j] = mtx[j][i];
                }
            }
            printTheMatrix(transM);
        }

        if (mtx.length < mtx[0].length){
            int[][] transM = new int[mtx[0].length][mtx.length];
            for (int i = 0; i < mtx.length; i++) {
                for (int j = 0; j < mtx[i].length; j++) {
                    transM[j][i] = mtx[i][j];
                }
            }
            printTheMatrix(transM);
        }
        return true;
    }

    //сделать транспонирование по побочной диагонали
    public static boolean transposeMatrixBySecondaryDiogonal (int [][] mtx) {

        if (mtx.length == mtx[0].length) {
            int[][] transM = new int[mtx.length][mtx.length];
            int columLen = mtx.length - 1;
            int elem = 0;
            for (int i = mtx.length - 1; i >= 0 ; i--) {
                for (int j = mtx[i].length - 1; j >= 0; j--) {
                    transM[columLen - j][elem] = mtx[i][j];
                }
                elem++;
            }
            printTheMatrix(transM);
        }

        if (mtx.length > mtx[0].length){
            int[][] transM = new int[mtx[0].length][mtx.length];
            int elem = 0;
            int columnLen = mtx[0].length - 1; //1
            for (int i = mtx.length - 1; i >= 0 ; i--) {
                for (int j = mtx[i].length - 1; j >= 0; j--) {
                    transM[columnLen - j][elem] = mtx[i][j];
                }
                elem++;
            }
            printTheMatrix(transM);
        }

        if (mtx.length < mtx[0].length){
            int[][] transM = new int[mtx[0].length][mtx.length];
            int rowLen = mtx[0].length - 1; //3
            int elem = 0;
            for (int i = mtx.length - 1; i >= 0; i--) {
                for (int j = mtx[i].length - 1; j >= 0 ; j--) {
                    transM[rowLen - j][elem] = mtx[i][j];
                }
                elem++;
            }
            printTheMatrix(transM);
        }
        return true;
    }

    }
