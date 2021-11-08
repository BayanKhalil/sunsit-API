    public class Time
    {
        protected int hour;
        protected int minute;
        protected int second;

        public Time (int _hour, int _minute, int _second)
        {
            hour = _hour;
            minute = _minute;
            second = _second;
        }

        public Time (double _hour)
        {
            while (_hour < 0.0)
                _hour = _hour + 24.0;
            while (_hour >= 24.0)
                _hour = _hour - 24.0;
            hour = (int)_hour;
            minute = (int)((_hour - hour) * 60.0);
            second = (int)((((_hour - hour) * 60.0) - minute) * 60.0);
        }

        public int getHour() { return hour; }
        public int getMinute() { return minute; }
        public int getSecond() { return second; }

        public double getFractionalHours ()
        {
            return hour + (minute / 60.0) + (second / 3600.0);
        }

        public String toString ()
        {
            String s = "";
            if (hour < 10)
                s += "0" + hour;
            else
                s += "" + hour;
            s += ":";
            if (minute < 10)
                s += "0" + minute;
            else
                s += "" + minute;
            s += ":";
            if (second < 10)
                s += "0" + second;
            else
                s += "" + second;
            return s;
        }
    }

