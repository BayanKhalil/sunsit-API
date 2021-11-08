


    public class SunTimesException extends Exception {
        /**
         *
         */
        private static final long serialVersionUID = -6679424439309121412L;

        public SunTimesException()
        {
            super ("Problem calculating sunrise/sunset times");
        }

        public SunTimesException (String s)
        {
            super (s);
        }
    }

