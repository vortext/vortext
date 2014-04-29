#
# Autogenerated by Thrift Compiler (0.9.1)
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#
#  options string: py:utf8strings,dynamic
#

from thrift.Thrift import TType, TMessageType, TException, TApplicationException
from ttypes import *
from thrift.Thrift import TProcessor
from thrift.protocol.TBase import TBase, TExceptionBase


class Iface(object):
  def ping(self):
    pass

  def run(self, document):
    """
    Parameters:
     - document
    """
    pass

  def shutdown(self):
    pass


class Client(Iface):
  def __init__(self, iprot, oprot=None):
    self._iprot = self._oprot = iprot
    if oprot is not None:
      self._oprot = oprot
    self._seqid = 0

  def ping(self):
    self.send_ping()
    self.recv_ping()

  def send_ping(self):
    self._oprot.writeMessageBegin('ping', TMessageType.CALL, self._seqid)
    args = ping_args()
    args.write(self._oprot)
    self._oprot.writeMessageEnd()
    self._oprot.trans.flush()

  def recv_ping(self):
    (fname, mtype, rseqid) = self._iprot.readMessageBegin()
    if mtype == TMessageType.EXCEPTION:
      x = TApplicationException()
      x.read(self._iprot)
      self._iprot.readMessageEnd()
      raise x
    result = ping_result()
    result.read(self._iprot)
    self._iprot.readMessageEnd()
    return

  def run(self, document):
    """
    Parameters:
     - document
    """
    self.send_run(document)
    return self.recv_run()

  def send_run(self, document):
    self._oprot.writeMessageBegin('run', TMessageType.CALL, self._seqid)
    args = run_args()
    args.document = document
    args.write(self._oprot)
    self._oprot.writeMessageEnd()
    self._oprot.trans.flush()

  def recv_run(self):
    (fname, mtype, rseqid) = self._iprot.readMessageBegin()
    if mtype == TMessageType.EXCEPTION:
      x = TApplicationException()
      x.read(self._iprot)
      self._iprot.readMessageEnd()
      raise x
    result = run_result()
    result.read(self._iprot)
    self._iprot.readMessageEnd()
    if result.success is not None:
      return result.success
    if result.error is not None:
      raise result.error
    raise TApplicationException(TApplicationException.MISSING_RESULT, "run failed: unknown result");

  def shutdown(self):
    self.send_shutdown()

  def send_shutdown(self):
    self._oprot.writeMessageBegin('shutdown', TMessageType.CALL, self._seqid)
    args = shutdown_args()
    args.write(self._oprot)
    self._oprot.writeMessageEnd()
    self._oprot.trans.flush()

class Processor(Iface, TProcessor):
  def __init__(self, handler):
    self._handler = handler
    self._processMap = {}
    self._processMap["ping"] = Processor.process_ping
    self._processMap["run"] = Processor.process_run
    self._processMap["shutdown"] = Processor.process_shutdown

  def process(self, iprot, oprot):
    (name, type, seqid) = iprot.readMessageBegin()
    if name not in self._processMap:
      iprot.skip(TType.STRUCT)
      iprot.readMessageEnd()
      x = TApplicationException(TApplicationException.UNKNOWN_METHOD, 'Unknown function %s' % (name))
      oprot.writeMessageBegin(name, TMessageType.EXCEPTION, seqid)
      x.write(oprot)
      oprot.writeMessageEnd()
      oprot.trans.flush()
      return
    else:
      self._processMap[name](self, seqid, iprot, oprot)
    return True

  def process_ping(self, seqid, iprot, oprot):
    args = ping_args()
    args.read(iprot)
    iprot.readMessageEnd()
    result = ping_result()
    self._handler.ping()
    oprot.writeMessageBegin("ping", TMessageType.REPLY, seqid)
    result.write(oprot)
    oprot.writeMessageEnd()
    oprot.trans.flush()

  def process_run(self, seqid, iprot, oprot):
    args = run_args()
    args.read(iprot)
    iprot.readMessageEnd()
    result = run_result()
    try:
      result.success = self._handler.run(args.document)
    except ProcessException, error:
      result.error = error
    oprot.writeMessageBegin("run", TMessageType.REPLY, seqid)
    result.write(oprot)
    oprot.writeMessageEnd()
    oprot.trans.flush()

  def process_shutdown(self, seqid, iprot, oprot):
    args = shutdown_args()
    args.read(iprot)
    iprot.readMessageEnd()
    self._handler.shutdown()
    return


# HELPER FUNCTIONS AND STRUCTURES

class ping_args(TBase):

  thrift_spec = (
  )

  def __repr__(self):
    L = ['%s=%r' % (key, value)
      for key, value in self.__dict__.iteritems()]
    return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

  def __eq__(self, other):
    return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

  def __ne__(self, other):
    return not (self == other)

class ping_result(TBase):

  thrift_spec = (
  )

  def __repr__(self):
    L = ['%s=%r' % (key, value)
      for key, value in self.__dict__.iteritems()]
    return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

  def __eq__(self, other):
    return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

  def __ne__(self, other):
    return not (self == other)

class run_args(TBase):
  """
  Attributes:
   - document
  """

  thrift_spec = (
    None, # 0
    (1, TType.STRUCT, 'document', (structs.ttypes.Document, structs.ttypes.Document.thrift_spec), None, ), # 1
  )

  def __init__(self, document=None,):
    self.document = document

  def __repr__(self):
    L = ['%s=%r' % (key, value)
      for key, value in self.__dict__.iteritems()]
    return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

  def __eq__(self, other):
    return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

  def __ne__(self, other):
    return not (self == other)

class run_result(TBase):
  """
  Attributes:
   - success
   - error
  """

  thrift_spec = (
    (0, TType.STRUCT, 'success', (structs.ttypes.Document, structs.ttypes.Document.thrift_spec), None, ), # 0
    (1, TType.STRUCT, 'error', (ProcessException, ProcessException.thrift_spec), None, ), # 1
  )

  def __init__(self, success=None, error=None,):
    self.success = success
    self.error = error

  def __repr__(self):
    L = ['%s=%r' % (key, value)
      for key, value in self.__dict__.iteritems()]
    return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

  def __eq__(self, other):
    return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

  def __ne__(self, other):
    return not (self == other)

class shutdown_args(TBase):

  thrift_spec = (
  )

  def __repr__(self):
    L = ['%s=%r' % (key, value)
      for key, value in self.__dict__.iteritems()]
    return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

  def __eq__(self, other):
    return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

  def __ne__(self, other):
    return not (self == other)
