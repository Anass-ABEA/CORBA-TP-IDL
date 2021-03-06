package exam.autogen;

/**
* HorlogePOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Horloge.idl
* jeudi 10 juin 2021 10 h 23 WEST
*/

public abstract class HorlogePOA extends org.omg.PortableServer.Servant
 implements HorlogeOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("_get_heure", new java.lang.Integer (0));
    _methods.put ("_get_minute", new java.lang.Integer (1));
    _methods.put ("GMT", new java.lang.Integer (2));
    _methods.put ("GMT_PLUS_1", new java.lang.Integer (3));
    _methods.put ("setTime", new java.lang.Integer (4));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // Horloge/_get_heure
       {
         int $result = (int)0;
         $result = this.heure ();
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 1:  // Horloge/_get_minute
       {
         int $result = (int)0;
         $result = this.minute ();
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 2:  // Horloge/GMT
       {
         String $result = null;
         $result = this.GMT ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 3:  // Horloge/GMT_PLUS_1
       {
         String $result = null;
         $result = this.GMT_PLUS_1 ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 4:  // Horloge/setTime
       {
         int h = in.read_long ();
         int m = in.read_long ();
         this.setTime (h, m);
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:Horloge:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Horloge _this() 
  {
    return HorlogeHelper.narrow(
    super._this_object());
  }

  public Horloge _this(org.omg.CORBA.ORB orb) 
  {
    return HorlogeHelper.narrow(
    super._this_object(orb));
  }


} // class HorlogePOA
