import org.omg.CORBA.MARSHAL;

public class main {
    public static void main(String[] args) {

//        int[][] mass = new int[4][4];
//        Matrix.fillTheMatrix(mass);
//        Matrix.printTheMatrix(mass);
//
//        Matrix.swapZeroToOneInPerimetr(mass);
//        System.out.println("\n" + "New matrix :");
//        Matrix.printTheMatrix(mass);

//        int[][] mass = new int[5][5];
//        Matrix.userMatrix(mass);

//        int[][] mass1 = new int[2][3];
//        Matrix.randomFillTheMatrix(mass1);
//        System.out.println("Первая матрица: ");
//        Matrix.printTheMatrix(mass1);
//
//        int[][] mass2 = new int[3][2];
//        Matrix.randomFillTheMatrix(mass2);
//        System.out.println("Вторая матрица: ");
//        Matrix.printTheMatrix(mass2);
//
//        System.out.println("Результат умножения двух матриц: ");
//        Matrix.printTheMatrix(Matrix.multiplyMatrix(mass1,mass2));


        int[][] mass1 = new int[][] {
                {3,5,7,5,7},
                {8,9,1,4,8},
                {2,7,4,7,8},
                {2,3,6,5,4},
                {3,4,5,9,3}
        };
        System.out.println("Первая матрица: ");
        Matrix.printTheMatrix(mass1);

//        System.out.println("Exponential matrix :");
//        Matrix.printTheMatrix(Matrix.exponentialMatrix(mass1, 1));


//        System.out.println("Exponential matrix 2 : ");
//        Matrix.exponentMatrix(mass1, 2);

//        System.out.println("Транспонированная матрица: ");
//        Matrix.transposeMatrix(mass1);


//        System.out.println("Единицы по главной диагонали: ");
//        Matrix.printTheMatrix(Matrix.kakaiatoFigneaSDiagonaliami(mass1));

//        int[][] mass2 = new int[][] {
//                {2,4,9},
//                {6,8,1},
//                {3,5,7}
//        };
//        System.out.println("Вторая матрица: ");
//        Matrix.printTheMatrix(mass2);

//        System.out.println("Sum two matrix: ");
//        Matrix.printTheMatrix(Matrix.sumMatrix(mass1, mass2));

//        System.out.println("Умножение на число первой матрицы: ");
//        Matrix.printTheMatrix(Matrix.multiplyMatrixToInteger(mass1, 2));
//
//        System.out.println("Результат умножения двух матриц: ");
//        Matrix.printTheMatrix(Matrix.multiplyMatrix(mass1,mass2));


       }
}
