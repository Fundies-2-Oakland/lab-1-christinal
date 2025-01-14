public class Vector3D {
    double x;
    double y;
    double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public String toString() {
        return "(" + String.format("%.2f", x) + ", " + String.format("%.2f", y) + ", " + String.format("%.2f", z) + ")";
    }

    public double getMagnitude() {
        return Math.abs(Math.sqrt(x * x + y * y + z * z));
    }

    public Vector3D normalize() {
        if (getMagnitude() == 0) {
            throw new IllegalStateException();
        }

        double newX = x / getMagnitude();
        double newY = y / getMagnitude();
        double newZ = z / getMagnitude();

        return new Vector3D(newX, newY, newZ);
    }

    public Vector3D add(Vector3D v1, Vector3D v2) {
        return new Vector3D(v1.getX() + v2.getX(), v1.getY() + v2.getY(), v1.getZ() + v2.getZ());
    }

    public Vector3D multiply(Vector3D vector, int constant) {
        return new Vector3D(vector.getX() * constant, vector.getY() * constant, vector.getZ() * constant);
    }
}
