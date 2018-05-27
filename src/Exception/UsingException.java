package Exception;

    public class UsingException
    {

        public static void main(String[] args)
        {
            try
            {
                throwException();
            }
            catch(Exception ex)
            {
                System.err.println("Exception handled in main");
            }
            doesnotThrowException();


        }

        private static void doesnotThrowException()
        {
            try
            {
                System.out.println("Method does not throwException");
            }
            catch(Exception ex)
            {
                System.err.println(ex);
            }
            finally
            {
                System.err.println("Finally executed in does not throw exception");
            }
            System.out.println("End of method doesnotThrowException");
        }
        public static void throwException() throws Exception
        {
            try
            {
                System.out.println("Method throw exception");
                throw new Exception();
            }
            catch(Exception e)
            {
                System.err.println("Exception handled in method throwException");

                throw e;
            }
            finally
            {
                System.err.println("Finally executed in throwException");
            }
        }

    }


