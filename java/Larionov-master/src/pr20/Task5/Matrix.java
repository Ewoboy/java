package pr20.Task5;

public class Matrix<T extends Number> {
    private T[][] data;
    private int rows;
    private int cols;

    public Matrix(T[][] data) {
        this.data = data;
        this.rows = data.length;
        this.cols = data[0].length;
    }

    // Сложение матриц
    public Matrix<Double> add(Matrix<T> other) {
        Double[][] result = new Double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = this.data[i][j].doubleValue() + other.data[i][j].doubleValue();
            }
        }
        return new Matrix<>(result);
    }

    // Умножение на число
    public Matrix<Double> multiply(T scalar) {
        Double[][] result = new Double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = this.data[i][j].doubleValue() * scalar.doubleValue();
            }
        }
        return new Matrix<>(result);
    }

    // Вывод матрицы
    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}