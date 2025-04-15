package level_2;

public class AnalogClock {
    public int solution(int h1, int m1, int s1, int h2, int m2, int s2) {
        long startSecond = h1 * 3600 + m1 * 60 + s1;
        long endSecond = h2 * 3600 + m2 * 60 + s2;
        // 0시부터 시작 시간까지 알람 횟수
        int startCount = getAlarmCount(startSecond);

        // 0시부터 종료 시간까지 알람 횟수
        int endCount = getAlarmCount(endSecond);

        // 시작 시간에 알람이 울리는 경우 처리
        if (isAlarmTime(startSecond) && startSecond != 0) {
            startCount--;
        }

        return endCount - startCount;
    }

    // 0시부터 특정 시간(초)까지 알람이 울린 횟수 계산
    private int getAlarmCount(long seconds) {
        // 시침-초침 만남 횟수 계산
        long hourHandCount = (seconds * 719) / 43200;

        // 분침-초침 만남 횟수 계산
        long minuteHandCount = (seconds * 59) / 3600;

        // 0시 0분 0초에 시침, 분침, 초침이 모두 겹치는 경우는 한 번만 카운트
        if (seconds == 0) {
            return 1;
        }

        // 12시 정각에 시침과 초침이 겹치는 경우 처리
        if (seconds % 43200 == 0) {
            hourHandCount--;
        }

        // 정각에 분침과 초침이 겹치는 경우 처리
        if (seconds % 3600 == 0) {
            minuteHandCount--;
        }

        return (int)(hourHandCount + minuteHandCount);
    }

    // 특정 시간에 알람이 울리는지 확인
    private boolean isAlarmTime(long seconds) {
        // 12시간 형식으로 변환 (43200초 = 12시간)
        long time = seconds % 43200;

        // 시침 각도: 시침은 12시간(43200초)에 360도 회전 = 30도/시간 = 0.5도/분 = 1/120도/초
        double hourAngle = (30.0 * (time / 3600.0)) + (0.5 * ((time % 3600) / 60.0));

        // 분침 각도: 분침은 60분(3600초)에 360도 회전 = 6도/분 = 0.1도/초
        double minuteAngle = 6.0 * (time / 60.0);

        // 초침 각도: 초침은 60초에 360도 회전 = 6도/초
        double secondAngle = 6.0 * (time % 60);

        // 시침과 초침이 겹치는 경우
        boolean hourSecondMeet = false;
        if (hourAngle == secondAngle) {
            hourSecondMeet = true;
        } else if (hourAngle < secondAngle) {
            // 시침이 초침보다 뒤에 있는 경우, 이전 초에서 겹쳤는지 확인
            double prevHourAngle = hourAngle - (1.0/120.0);
            double prevSecondAngle = secondAngle - 6.0;
            if (prevHourAngle < 0) prevHourAngle += 360.0;
            if (prevSecondAngle < 0) prevSecondAngle += 360.0;

            if ((hourAngle < secondAngle && prevHourAngle > prevSecondAngle) ||
                    (hourAngle > secondAngle && prevHourAngle < prevSecondAngle)) {
                hourSecondMeet = true;
            }
        } else {
            // 시침이 초침보다 앞에 있는 경우, 이전 초에서 겹쳤는지 확인
            double prevHourAngle = hourAngle - (1.0/120.0);
            double prevSecondAngle = secondAngle - 6.0;
            if (prevHourAngle < 0) prevHourAngle += 360.0;
            if (prevSecondAngle < 0) prevSecondAngle += 360.0;

            if ((hourAngle > secondAngle && prevHourAngle < prevSecondAngle) ||
                    (hourAngle < secondAngle && prevHourAngle > prevSecondAngle)) {
                hourSecondMeet = true;
            }
        }

        // 분침과 초침이 겹치는 경우
        boolean minuteSecondMeet = false;
        if (minuteAngle == secondAngle) {
            minuteSecondMeet = true;
        } else if (minuteAngle < secondAngle) {
            // 분침이 초침보다 뒤에 있는 경우, 이전 초에서 겹쳤는지 확인
            double prevMinuteAngle = minuteAngle - 0.1;
            double prevSecondAngle = secondAngle - 6.0;
            if (prevMinuteAngle < 0) prevMinuteAngle += 360.0;
            if (prevSecondAngle < 0) prevSecondAngle += 360.0;

            if ((minuteAngle < secondAngle && prevMinuteAngle > prevSecondAngle) ||
                    (minuteAngle > secondAngle && prevMinuteAngle < prevSecondAngle)) {
                minuteSecondMeet = true;
            }
        } else {
            // 분침이 초침보다 앞에 있는 경우, 이전 초에서 겹쳤는지 확인
            double prevMinuteAngle = minuteAngle - 0.1;
            double prevSecondAngle = secondAngle - 6.0;
            if (prevMinuteAngle < 0) prevMinuteAngle += 360.0;
            if (prevSecondAngle < 0) prevSecondAngle += 360.0;

            if ((minuteAngle > secondAngle && prevMinuteAngle < prevSecondAngle) ||
                    (minuteAngle < secondAngle && prevMinuteAngle > prevSecondAngle)) {
                minuteSecondMeet = true;
            }
        }

        return hourSecondMeet || minuteSecondMeet;
    }

    public static void main(String[] args) {
        AnalogClock clock = new AnalogClock();
        System.out.println(clock.solution(0, 0, 0, 1, 0, 0)); // 1
        System.out.println(clock.solution(0, 0, 0, 12, 0, 0)); // 1
        System.out.println(clock.solution(0, 0, 0, 12, 30, 0)); // 2
        System.out.println(clock.solution(1, 30, 30, 2, 30, 30)); // 1
    }

}
