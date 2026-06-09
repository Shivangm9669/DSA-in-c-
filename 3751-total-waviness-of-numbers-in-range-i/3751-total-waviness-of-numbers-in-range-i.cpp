class Solution {
public:
    int totalWaviness(int num1, int num2) {
        int count = 0;

    for (int i = num1; i <= num2; i++) {
        int num = i;

        while (num >= 100) {
            int first  = num % 10;
            int second = (num / 10) % 10;
            int third  = (num / 100) % 10;

            if ((first > second && second < third) ||
                (first < second && second > third)) {
                count++;
            }

            num /= 10;
        }
    }

    return count;
    }
};