class Solution {
    public double[] convertTemperature(double celsius) {
        double cel = celsius;
        double kel = cel + 273.15;
        double far = cel * 1.80 + 32;

        double[] ans = new double[] {kel, far};

        return ans;
    }
}

    