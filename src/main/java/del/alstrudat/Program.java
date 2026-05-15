package del.alstrudat;

public class Program {
    public static Student[] mergeSort(Student[] data) {
        if (data.length <= 1) {
            return data;
        }

        int mid = data.length / 2;

        Student[] left = new Student[mid];
        Student[] right = new Student[data.length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = data[i];
        }
        for (int i = mid; i < data.length; i++) {
            right[i - mid] = data[i];
        }

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    private static Student[] merge(Student[] left, Student[] right) {
        Student[] result = new Student[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (compare(left[i], right[j]) <= 0) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length) result[k++] = left[i++];
        while (j < right.length) result[k++] = right[j++];

        return result;
    }

    // Return nilai <= 0 jika a harus lebih dulu dari b
    private static int compare(Student a, Student b) {
        if (a.score != b.score) {
            // Score lebih besar → duluan (descending)
            return b.score - a.score;
        }
        // Score sama → NIM lebih kecil duluan (ascending)
        return a.nim.compareTo(b.nim);
    }
}
