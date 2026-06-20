class Solution {
public:
    double angleClock(int hour, int minutes) {

        hour %= 12;

        double hourDegree = hour * 30 + minutes * 0.5;
        double minuteDegree = minutes * 6;

        double diff = abs(hourDegree - minuteDegree);

        return min(diff, 360 - diff);
    }
};