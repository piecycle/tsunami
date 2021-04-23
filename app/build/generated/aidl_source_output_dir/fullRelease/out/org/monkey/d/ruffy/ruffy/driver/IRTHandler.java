/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.monkey.d.ruffy.ruffy.driver;
public interface IRTHandler extends android.os.IInterface
{
  /** Default implementation for IRTHandler. */
  public static class Default implements org.monkey.d.ruffy.ruffy.driver.IRTHandler
  {
    @Override public void log(java.lang.String message) throws android.os.RemoteException
    {
    }
    @Override public void fail(java.lang.String message) throws android.os.RemoteException
    {
    }
    @Override public void requestBluetooth() throws android.os.RemoteException
    {
    }
    @Override public void rtStopped() throws android.os.RemoteException
    {
    }
    @Override public void rtStarted() throws android.os.RemoteException
    {
    }
    @Override public void rtClearDisplay() throws android.os.RemoteException
    {
    }
    @Override public void rtUpdateDisplay(byte[] quarter, int which) throws android.os.RemoteException
    {
    }
    @Override public void rtDisplayHandleMenu(org.monkey.d.ruffy.ruffy.driver.display.Menu menu) throws android.os.RemoteException
    {
    }
    @Override public void rtDisplayHandleNoMenu() throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements org.monkey.d.ruffy.ruffy.driver.IRTHandler
  {
    private static final java.lang.String DESCRIPTOR = "org.monkey.d.ruffy.ruffy.driver.IRTHandler";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.monkey.d.ruffy.ruffy.driver.IRTHandler interface,
     * generating a proxy if needed.
     */
    public static org.monkey.d.ruffy.ruffy.driver.IRTHandler asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.monkey.d.ruffy.ruffy.driver.IRTHandler))) {
        return ((org.monkey.d.ruffy.ruffy.driver.IRTHandler)iin);
      }
      return new org.monkey.d.ruffy.ruffy.driver.IRTHandler.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
        case TRANSACTION_log:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.log(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_fail:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.fail(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_requestBluetooth:
        {
          data.enforceInterface(descriptor);
          this.requestBluetooth();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_rtStopped:
        {
          data.enforceInterface(descriptor);
          this.rtStopped();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_rtStarted:
        {
          data.enforceInterface(descriptor);
          this.rtStarted();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_rtClearDisplay:
        {
          data.enforceInterface(descriptor);
          this.rtClearDisplay();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_rtUpdateDisplay:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          int _arg1;
          _arg1 = data.readInt();
          this.rtUpdateDisplay(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_rtDisplayHandleMenu:
        {
          data.enforceInterface(descriptor);
          org.monkey.d.ruffy.ruffy.driver.display.Menu _arg0;
          if ((0!=data.readInt())) {
            _arg0 = org.monkey.d.ruffy.ruffy.driver.display.Menu.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          this.rtDisplayHandleMenu(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_rtDisplayHandleNoMenu:
        {
          data.enforceInterface(descriptor);
          this.rtDisplayHandleNoMenu();
          reply.writeNoException();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements org.monkey.d.ruffy.ruffy.driver.IRTHandler
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      @Override public void log(java.lang.String message) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(message);
          boolean _status = mRemote.transact(Stub.TRANSACTION_log, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().log(message);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void fail(java.lang.String message) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(message);
          boolean _status = mRemote.transact(Stub.TRANSACTION_fail, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().fail(message);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void requestBluetooth() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_requestBluetooth, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().requestBluetooth();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void rtStopped() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_rtStopped, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().rtStopped();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void rtStarted() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_rtStarted, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().rtStarted();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void rtClearDisplay() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_rtClearDisplay, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().rtClearDisplay();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void rtUpdateDisplay(byte[] quarter, int which) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(quarter);
          _data.writeInt(which);
          boolean _status = mRemote.transact(Stub.TRANSACTION_rtUpdateDisplay, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().rtUpdateDisplay(quarter, which);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void rtDisplayHandleMenu(org.monkey.d.ruffy.ruffy.driver.display.Menu menu) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((menu!=null)) {
            _data.writeInt(1);
            menu.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_rtDisplayHandleMenu, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().rtDisplayHandleMenu(menu);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void rtDisplayHandleNoMenu() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_rtDisplayHandleNoMenu, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().rtDisplayHandleNoMenu();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static org.monkey.d.ruffy.ruffy.driver.IRTHandler sDefaultImpl;
    }
    static final int TRANSACTION_log = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_fail = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_requestBluetooth = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_rtStopped = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_rtStarted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_rtClearDisplay = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_rtUpdateDisplay = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_rtDisplayHandleMenu = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_rtDisplayHandleNoMenu = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    public static boolean setDefaultImpl(org.monkey.d.ruffy.ruffy.driver.IRTHandler impl) {
      if (Stub.Proxy.sDefaultImpl == null && impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static org.monkey.d.ruffy.ruffy.driver.IRTHandler getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  public void log(java.lang.String message) throws android.os.RemoteException;
  public void fail(java.lang.String message) throws android.os.RemoteException;
  public void requestBluetooth() throws android.os.RemoteException;
  public void rtStopped() throws android.os.RemoteException;
  public void rtStarted() throws android.os.RemoteException;
  public void rtClearDisplay() throws android.os.RemoteException;
  public void rtUpdateDisplay(byte[] quarter, int which) throws android.os.RemoteException;
  public void rtDisplayHandleMenu(org.monkey.d.ruffy.ruffy.driver.display.Menu menu) throws android.os.RemoteException;
  public void rtDisplayHandleNoMenu() throws android.os.RemoteException;
}
