package pos.corba;

/**
* hello/HelloHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Hello.idl
* Sábado, 18 de Junho de 2016 17h50min31s BRT
*/

public final class HelloHolder implements org.omg.CORBA.portable.Streamable
{
  public pos.corba.Hello value = null;

  public HelloHolder ()
  {
  }

  public HelloHolder (pos.corba.Hello initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = pos.corba.HelloHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
        pos.corba.HelloHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return pos.corba.HelloHelper.type ();
  }

}
