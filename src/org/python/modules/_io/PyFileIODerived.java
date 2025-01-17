/* Generated file, do not modify.  See jython/src/templates/gderived.py. */
package org.python.modules._io;

import java.io.Serializable;
import org.python.core.*;
import org.python.core.finalization.FinalizeTrigger;
import org.python.core.finalization.FinalizablePyObjectDerived;

public class PyFileIODerived extends PyFileIO implements Slotted,FinalizablePyObjectDerived,TraverseprocDerived {

    public PyObject getSlot(int index) {
        return slots[index];
    }

    public void setSlot(int index,PyObject value) {
        slots[index]=value;
    }

    private PyObject[]slots;

    public void __del_derived__() {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__del__");
        if (impl!=null) {
            impl.__get__(this,self_type).__call__();
        }
    }

    public void __ensure_finalizer__() {
        FinalizeTrigger.ensureFinalizer(this);
    }

    /* TraverseprocDerived implementation */
    public int traverseDerived(Visitproc visit,Object arg) {
        int retVal;
        for(int i=0;i<slots.length;++i) {
            if (slots[i]!=null) {
                retVal=visit.visit(slots[i],arg);
                if (retVal!=0) {
                    return retVal;
                }
            }
        }
        retVal=visit.visit(objtype,arg);
        return retVal!=0?retVal:traverseDictIfAny(visit,arg);
    }

    /* end of TraverseprocDerived implementation */

    public PyFileIODerived(PyType subtype,PyObject file,OpenMode mode,boolean closefd) {
        super(subtype,file,mode,closefd);
        slots=new PyObject[subtype.getNumSlots()];
        if (subtype.needsFinalizer()) {
            FinalizeTrigger.ensureFinalizer(this);
        }
    }

    public int traverseDictIfAny(Visitproc visit,Object arg) {
        return 0;
    }

    public PyString __str__() {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__str__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__();
            if (res instanceof PyString)
                return(PyString)res;
            throw Py.TypeError("__str__"+" returned non-"+"string"+" (type "+res.getType().fastGetName()+")");
        }
        return super.__str__();
    }

    public PyString __repr__() {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__repr__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__();
            if (res instanceof PyString)
                return(PyString)res;
            throw Py.TypeError("__repr__"+" returned non-"+"string"+" (type "+res.getType().fastGetName()+")");
        }
        return super.__repr__();
    }

    public PyString __hex__() {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__hex__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__();
            if (res instanceof PyString)
                return(PyString)res;
            throw Py.TypeError("__hex__"+" returned non-"+"string"+" (type "+res.getType().fastGetName()+")");
        }
        return super.__hex__();
    }

    public PyString __oct__() {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__oct__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__();
            if (res instanceof PyString)
                return(PyString)res;
            throw Py.TypeError("__oct__"+" returned non-"+"string"+" (type "+res.getType().fastGetName()+")");
        }
        return super.__oct__();
    }

    public PyFloat __float__() {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__float__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__();
            if (res instanceof PyFloat)
                return(PyFloat)res;
            throw Py.TypeError("__float__"+" returned non-"+"float"+" (type "+res.getType().fastGetName()+")");
        }
        return super.__float__();
    }

    public PyComplex __complex__() {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__complex__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__();
            if (res instanceof PyComplex)
                return(PyComplex)res;
            throw Py.TypeError("__complex__"+" returned non-"+"complex"+" (type "+res.getType().fastGetName()+")");
        }
        return super.__complex__();
    }

    public PyObject __pos__() {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__pos__");
        if (impl!=null)
            return impl.__get__(this,self_type).__call__();
        return super.__pos__();
    }

    public PyObject __neg__() {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__neg__");
        if (impl!=null)
            return impl.__get__(this,self_type).__call__();
        return super.__neg__();
    }

    public PyObject __abs__() {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__abs__");
        if (impl!=null)
            return impl.__get__(this,self_type).__call__();
        return super.__abs__();
    }

    public PyObject __invert__() {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__invert__");
        if (impl!=null)
            return impl.__get__(this,self_type).__call__();
        return super.__invert__();
    }

    public PyObject __reduce__() {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__reduce__");
        if (impl!=null)
            return impl.__get__(this,self_type).__call__();
        return super.__reduce__();
    }

    public PyObject __dir__() {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__dir__");
        if (impl!=null)
            return impl.__get__(this,self_type).__call__();
        return super.__dir__();
    }

    public PyObject __add__(PyObject other) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__add__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__(other);
            if (res==Py.NotImplemented)
                return null;
            return res;
        }
        return super.__add__(other);
    }

    public PyObject __radd__(PyObject other) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__radd__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__(other);
            if (res==Py.NotImplemented)
                return null;
            return res;
        }
        return super.__radd__(other);
    }

    public PyObject __sub__(PyObject other) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__sub__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__(other);
            if (res==Py.NotImplemented)
                return null;
            return res;
        }
        return super.__sub__(other);
    }

    public PyObject __rsub__(PyObject other) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__rsub__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__(other);
            if (res==Py.NotImplemented)
                return null;
            return res;
        }
        return super.__rsub__(other);
    }

    public PyObject __mul__(PyObject other) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__mul__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__(other);
            if (res==Py.NotImplemented)
                return null;
            return res;
        }
        return super.__mul__(other);
    }

    public PyObject __rmul__(PyObject other) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__rmul__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__(other);
            if (res==Py.NotImplemented)
                return null;
            return res;
        }
        return super.__rmul__(other);
    }

    public PyObject __div__(PyObject other) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__div__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__(other);
            if (res==Py.NotImplemented)
                return null;
            return res;
        }
        return super.__div__(other);
    }

    public PyObject __rdiv__(PyObject other) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__rdiv__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__(other);
            if (res==Py.NotImplemented)
                return null;
            return res;
        }
        return super.__rdiv__(other);
    }

    public PyObject __floordiv__(PyObject other) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__floordiv__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__(other);
            if (res==Py.NotImplemented)
                return null;
            return res;
        }
        return super.__floordiv__(other);
    }

    public PyObject __rfloordiv__(PyObject other) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__rfloordiv__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__(other);
            if (res==Py.NotImplemented)
                return null;
            return res;
        }
        return super.__rfloordiv__(other);
    }

    public PyObject __truediv__(PyObject other) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__truediv__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__(other);
            if (res==Py.NotImplemented)
                return null;
            return res;
        }
        return super.__truediv__(other);
    }

    public PyObject __rtruediv__(PyObject other) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__rtruediv__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__(other);
            if (res==Py.NotImplemented)
                return null;
            return res;
        }
        return super.__rtruediv__(other);
    }

    public PyObject __mod__(PyObject other) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__mod__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__(other);
            if (res==Py.NotImplemented)
                return null;
            return res;
        }
        return super.__mod__(other);
    }

    public PyObject __rmod__(PyObject other) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__rmod__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__(other);
            if (res==Py.NotImplemented)
                return null;
            return res;
        }
        return super.__rmod__(other);
    }

    public PyObject __divmod__(PyObject other) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__divmod__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__(other);
            if (res==Py.NotImplemented)
                return null;
            return res;
        }
        return super.__divmod__(other);
    }

    public PyObject __rdivmod__(PyObject other) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__rdivmod__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__(other);
            if (res==Py.NotImplemented)
                return null;
            return res;
        }
        return super.__rdivmod__(other);
    }

    public PyObject __rpow__(PyObject other) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__rpow__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__(other);
            if (res==Py.NotImplemented)
                return null;
            return res;
        }
        return super.__rpow__(other);
    }

    public PyObject __lshift__(PyObject other) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__lshift__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__(other);
            if (res==Py.NotImplemented)
                return null;
            return res;
        }
        return super.__lshift__(other);
    }

    public PyObject __rlshift__(PyObject other) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__rlshift__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__(other);
            if (res==Py.NotImplemented)
                return null;
            return res;
        }
        return super.__rlshift__(other);
    }

    public PyObject __rshift__(PyObject other) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__rshift__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__(other);
            if (res==Py.NotImplemented)
                return null;
            return res;
        }
        return super.__rshift__(other);
    }

    public PyObject __rrshift__(PyObject other) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__rrshift__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__(other);
            if (res==Py.NotImplemented)
                return null;
            return res;
        }
        return super.__rrshift__(other);
    }

    public PyObject __and__(PyObject other) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__and__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__(other);
            if (res==Py.NotImplemented)
                return null;
            return res;
        }
        return super.__and__(other);
    }

    public PyObject __rand__(PyObject other) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__rand__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__(other);
            if (res==Py.NotImplemented)
                return null;
            return res;
        }
        return super.__rand__(other);
    }

    public PyObject __or__(PyObject other) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__or__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__(other);
            if (res==Py.NotImplemented)
                return null;
            return res;
        }
        return super.__or__(other);
    }

    public PyObject __ror__(PyObject other) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__ror__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__(other);
            if (res==Py.NotImplemented)
                return null;
            return res;
        }
        return super.__ror__(other);
    }

    public PyObject __xor__(PyObject other) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__xor__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__(other);
            if (res==Py.NotImplemented)
                return null;
            return res;
        }
        return super.__xor__(other);
    }

    public PyObject __rxor__(PyObject other) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__rxor__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__(other);
            if (res==Py.NotImplemented)
                return null;
            return res;
        }
        return super.__rxor__(other);
    }

    public PyObject __lt__(PyObject other) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__lt__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__(other);
            if (res==Py.NotImplemented)
                return null;
            return res;
        }
        return super.__lt__(other);
    }

    public PyObject __le__(PyObject other) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__le__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__(other);
            if (res==Py.NotImplemented)
                return null;
            return res;
        }
        return super.__le__(other);
    }

    public PyObject __gt__(PyObject other) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__gt__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__(other);
            if (res==Py.NotImplemented)
                return null;
            return res;
        }
        return super.__gt__(other);
    }

    public PyObject __ge__(PyObject other) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__ge__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__(other);
            if (res==Py.NotImplemented)
                return null;
            return res;
        }
        return super.__ge__(other);
    }

    public PyObject __eq__(PyObject other) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__eq__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__(other);
            if (res==Py.NotImplemented)
                return null;
            return res;
        }
        return super.__eq__(other);
    }

    public PyObject __ne__(PyObject other) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__ne__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__(other);
            if (res==Py.NotImplemented)
                return null;
            return res;
        }
        return super.__ne__(other);
    }

    public PyObject __format__(PyObject other) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__format__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__(other);
            if (res==Py.NotImplemented)
                return null;
            return res;
        }
        return super.__format__(other);
    }

    public PyObject __iadd__(PyObject other) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__iadd__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__(other);
            if (res==Py.NotImplemented)
                return null;
            return res;
        }
        return super.__iadd__(other);
    }

    public PyObject __isub__(PyObject other) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__isub__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__(other);
            if (res==Py.NotImplemented)
                return null;
            return res;
        }
        return super.__isub__(other);
    }

    public PyObject __imul__(PyObject other) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__imul__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__(other);
            if (res==Py.NotImplemented)
                return null;
            return res;
        }
        return super.__imul__(other);
    }

    public PyObject __idiv__(PyObject other) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__idiv__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__(other);
            if (res==Py.NotImplemented)
                return null;
            return res;
        }
        return super.__idiv__(other);
    }

    public PyObject __ifloordiv__(PyObject other) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__ifloordiv__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__(other);
            if (res==Py.NotImplemented)
                return null;
            return res;
        }
        return super.__ifloordiv__(other);
    }

    public PyObject __itruediv__(PyObject other) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__itruediv__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__(other);
            if (res==Py.NotImplemented)
                return null;
            return res;
        }
        return super.__itruediv__(other);
    }

    public PyObject __imod__(PyObject other) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__imod__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__(other);
            if (res==Py.NotImplemented)
                return null;
            return res;
        }
        return super.__imod__(other);
    }

    public PyObject __ipow__(PyObject other) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__ipow__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__(other);
            if (res==Py.NotImplemented)
                return null;
            return res;
        }
        return super.__ipow__(other);
    }

    public PyObject __ilshift__(PyObject other) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__ilshift__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__(other);
            if (res==Py.NotImplemented)
                return null;
            return res;
        }
        return super.__ilshift__(other);
    }

    public PyObject __irshift__(PyObject other) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__irshift__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__(other);
            if (res==Py.NotImplemented)
                return null;
            return res;
        }
        return super.__irshift__(other);
    }

    public PyObject __iand__(PyObject other) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__iand__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__(other);
            if (res==Py.NotImplemented)
                return null;
            return res;
        }
        return super.__iand__(other);
    }

    public PyObject __ior__(PyObject other) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__ior__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__(other);
            if (res==Py.NotImplemented)
                return null;
            return res;
        }
        return super.__ior__(other);
    }

    public PyObject __ixor__(PyObject other) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__ixor__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__(other);
            if (res==Py.NotImplemented)
                return null;
            return res;
        }
        return super.__ixor__(other);
    }

    public PyObject __int__() {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__int__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__();
            if (res instanceof PyInteger||res instanceof PyLong)
                return res;
            throw Py.TypeError("__int__"+" should return an integer");
        }
        return super.__int__();
    }

    public PyObject __long__() {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__long__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__();
            if (res instanceof PyLong||res instanceof PyInteger)
                return res;
            throw Py.TypeError("__long__"+" returned non-"+"long"+" (type "+res.getType().fastGetName()+")");
        }
        return super.__long__();
    }

    public int hashCode() {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__hash__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__();
            if (res instanceof PyInteger) {
                return((PyInteger)res).getValue();
            } else
                if (res instanceof PyLong) {
                    return((PyLong)res).getValue().intValue();
                }
            throw Py.TypeError("__hash__ should return a int");
        }
        if (self_type.lookup("__eq__")!=null||self_type.lookup("__cmp__")!=null) {
            throw Py.TypeError(String.format("unhashable type: '%.200s'",getType().fastGetName()));
        }
        return super.hashCode();
    }

    public PyUnicode __unicode__() {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__unicode__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__();
            if (res instanceof PyUnicode)
                return(PyUnicode)res;
            if (res instanceof PyString)
                return new PyUnicode((PyString)res);
            throw Py.TypeError("__unicode__"+" should return a "+"unicode");
        }
        return super.__unicode__();
    }

    public int __cmp__(PyObject other) {
        PyType self_type=getType();
        PyObject[]where_type=new PyObject[1];
        PyObject impl=self_type.lookup_where("__cmp__",where_type);
        // Full Compatibility with CPython __cmp__:
        // If the derived type don't override __cmp__, the
        // *internal* super().__cmp__ should be called, not the
        // exposed one. The difference is that the exposed __cmp__
        // throws a TypeError if the argument is an instance of the same type.
        if (impl==null||where_type[0]==TYPE||Py.isSubClass(TYPE,where_type[0])) {
            return super.__cmp__(other);
        }
        PyObject res=impl.__get__(this,self_type).__call__(other);
        if (res==Py.NotImplemented) {
            return-2;
        }
        int c=res.asInt();
        return c<0?-1:c>0?1:0;
    }

    public boolean __nonzero__() {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__nonzero__");
        if (impl==null) {
            impl=self_type.lookup("__len__");
            if (impl==null)
                return super.__nonzero__();
        }
        PyObject o=impl.__get__(this,self_type).__call__();
        Class c=o.getClass();
        if (c!=PyInteger.class&&c!=PyBoolean.class) {
            throw Py.TypeError(String.format("__nonzero__ should return bool or int, returned %s",self_type.getName()));
        }
        return o.__nonzero__();
    }

    public boolean __contains__(PyObject o) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__contains__");
        if (impl==null)
            return super.__contains__(o);
        return impl.__get__(this,self_type).__call__(o).__nonzero__();
    }

    public int __len__() {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__len__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__();
            return res.asInt();
        }
        return super.__len__();
    }

    public PyObject __iter__() {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__iter__");
        if (impl!=null)
            return impl.__get__(this,self_type).__call__();
        impl=self_type.lookup("__getitem__");
        if (impl==null)
            return super.__iter__();
        return new PySequenceIter(this);
    }

    public PyObject __iternext__() {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("next");
        if (impl!=null) {
            try {
                return impl.__get__(this,self_type).__call__();
            } catch (PyException exc) {
                if (exc.match(Py.StopIteration))
                    return null;
                throw exc;
            }
        }
        return super.__iternext__(); // ???
    }

    public PyObject __finditem__(PyObject key) { // ???
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__getitem__");
        if (impl!=null)
            try {
                return impl.__get__(this,self_type).__call__(key);
            } catch (PyException exc) {
                if (exc.match(Py.LookupError))
                    return null;
                throw exc;
            }
        return super.__finditem__(key);
    }

    public PyObject __finditem__(int key) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__getitem__");
        if (impl!=null)
            try {
                return impl.__get__(this,self_type).__call__(new PyInteger(key));
            } catch (PyException exc) {
                if (exc.match(Py.LookupError))
                    return null;
                throw exc;
            }
        return super.__finditem__(key);
    }

    public PyObject __getitem__(PyObject key) {
        // Same as __finditem__, without swallowing LookupErrors. This allows
        // __getitem__ implementations written in Python to raise custom
        // exceptions (such as subclasses of KeyError).
        //
        // We are forced to duplicate the code, instead of defining __finditem__
        // in terms of __getitem__. That's because PyObject defines __getitem__
        // in terms of __finditem__. Therefore, we would end with an infinite
        // loop when self_type.lookup("__getitem__") returns null:
        //
        //  __getitem__ -> super.__getitem__ -> __finditem__ -> __getitem__
        //
        // By duplicating the (short) lookup and call code, we are safe, because
        // the call chains will be:
        //
        // __finditem__ -> super.__finditem__
        //
        // __getitem__ -> super.__getitem__ -> __finditem__ -> super.__finditem__

        PyType self_type=getType();
        PyObject impl=self_type.lookup("__getitem__");
        if (impl!=null)
            return impl.__get__(this,self_type).__call__(key);
        return super.__getitem__(key);
    }

    public void __setitem__(PyObject key,PyObject value) { // ???
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__setitem__");
        if (impl!=null) {
            impl.__get__(this,self_type).__call__(key,value);
            return;
        }
        super.__setitem__(key,value);
    }

    public PyObject __getslice__(PyObject start,PyObject stop,PyObject step) { // ???
        if (step!=null) {
            return __getitem__(new PySlice(start,stop,step));
        }
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__getslice__");
        if (impl!=null) {
            PyObject[]indices=PySlice.indices2(this,start,stop);
            return impl.__get__(this,self_type).__call__(indices[0],indices[1]);
        }
        return super.__getslice__(start,stop,step);
    }

    public void __setslice__(PyObject start,PyObject stop,PyObject step,PyObject value) {
        if (step!=null) {
            __setitem__(new PySlice(start,stop,step),value);
            return;
        }
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__setslice__");
        if (impl!=null) {
            PyObject[]indices=PySlice.indices2(this,start,stop);
            impl.__get__(this,self_type).__call__(indices[0],indices[1],value);
            return;
        }
        super.__setslice__(start,stop,step,value);
    }

    public void __delslice__(PyObject start,PyObject stop,PyObject step) {
        if (step!=null) {
            __delitem__(new PySlice(start,stop,step));
            return;
        }
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__delslice__");
        if (impl!=null) {
            PyObject[]indices=PySlice.indices2(this,start,stop);
            impl.__get__(this,self_type).__call__(indices[0],indices[1]);
            return;
        }
        super.__delslice__(start,stop,step);
    }

    public void __delitem__(PyObject key) { // ???
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__delitem__");
        if (impl!=null) {
            impl.__get__(this,self_type).__call__(key);
            return;
        }
        super.__delitem__(key);
    }

    public PyObject __call__(PyObject args[],String keywords[]) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__call__");
        if (impl!=null) {
            return impl.__get__(this,self_type).__call__(args,keywords);
        }
        return super.__call__(args,keywords);
    }

    public PyObject __findattr_ex__(String name) {
        return Deriveds.__findattr_ex__(this,name);
    }

    public void __setattr__(String name,PyObject value) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__setattr__");
        if (impl!=null) {
            impl.__get__(this,self_type).__call__(PyString.fromInterned(name),value);
            //CPython does not support instance-acquired finalizers.
            //So we don't check for __del__ here.
            return;
        }
        super.__setattr__(name,value);
    }

    public void __delattr__(String name) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__delattr__");
        if (impl!=null) {
            impl.__get__(this,self_type).__call__(PyString.fromInterned(name));
            return;
        }
        super.__delattr__(name);
    }

    public PyObject __get__(PyObject obj,PyObject type) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__get__");
        if (impl!=null) {
            if (obj==null)
                obj=Py.None;
            if (type==null)
                type=Py.None;
            return impl.__get__(this,self_type).__call__(obj,type);
        }
        return super.__get__(obj,type);
    }

    public void __set__(PyObject obj,PyObject value) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__set__");
        if (impl!=null) {
            impl.__get__(this,self_type).__call__(obj,value);
            return;
        }
        super.__set__(obj,value);
    }

    public void __delete__(PyObject obj) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__delete__");
        if (impl!=null) {
            impl.__get__(this,self_type).__call__(obj);
            return;
        }
        super.__delete__(obj);
    }

    public PyObject __pow__(PyObject other,PyObject modulo) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__pow__");
        if (impl!=null) {
            PyObject res;
            if (modulo==null) {
                res=impl.__get__(this,self_type).__call__(other);
            } else {
                res=impl.__get__(this,self_type).__call__(other,modulo);
            }
            if (res==Py.NotImplemented)
                return null;
            return res;
        }
        return super.__pow__(other,modulo);
    }

    public void dispatch__init__(PyObject[]args,String[]keywords) {
        Deriveds.dispatch__init__(this,args,keywords);
    }

    public PyObject __index__() {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__index__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__();
            if (res instanceof PyInteger||res instanceof PyLong) {
                return res;
            }
            throw Py.TypeError(String.format("__index__ returned non-(int,long) (type %s)",res.getType().fastGetName()));
        }
        return super.__index__();
    }

    public Object __tojava__(Class c) {
        // If we are not being asked by the "default" conversion to java, then
        // we can provide this as the result, as long as it is a instance of the
        // specified class. Without this, derived.__tojava__(PyObject.class)
        // would broke. (And that's not pure speculation: PyReflectedFunction's
        // ReflectedArgs asks for things like that).
        if ((c!=Object.class)&&(c!=Serializable.class)&&(c.isInstance(this))) {
            return this;
        }
        // Otherwise, we call the derived __tojava__, if it exists:
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__tojava__");
        if (impl!=null) {
            PyObject delegate=impl.__get__(this,self_type).__call__(Py.java2py(c));
            if (delegate!=this)
                return delegate.__tojava__(Object.class);
        }
        return super.__tojava__(c);
    }

    public Object __coerce_ex__(PyObject o) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__coerce__");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__(o);
            if (res==Py.NotImplemented)
                return Py.None;
            if (!(res instanceof PyTuple))
                throw Py.TypeError("__coerce__ didn't return a 2-tuple");
            return((PyTuple)res).getArray();
        }
        return super.__coerce_ex__(o);
    }

    public PyObject __enter__() {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__enter__");
        if (impl!=null)
            return impl.__get__(this,self_type).__call__();
        return super.__enter__();
    }

    public PyObject fileno() {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("fileno");
        if (impl!=null)
            return impl.__get__(this,self_type).__call__();
        return super.fileno();
    }

    // Hand-crafted in _io._IOBase.derived

    public long seek(long pos,int whence) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("seek");
        if (impl!=null) {
            return impl.__get__(this,self_type).__call__(Py.newLong(pos),Py.newInteger(whence)).asLong();
        } else {
            return super.seek(pos,whence);
        }
    }

    public long tell() {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("tell");
        if (impl!=null) {
            return impl.__get__(this,self_type).__call__().asLong();
        } else {
            return super.tell();
        }
    }

    public long truncate(long size) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("truncate");
        if (impl!=null) {
            return impl.__get__(this,self_type).__call__(Py.newLong(size)).asLong();
        } else {
            return super.truncate(size);
        }
    }

    public long truncate() {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("truncate");
        if (impl!=null) {
            return impl.__get__(this,self_type).__call__().asLong();
        } else {
            return super.truncate();
        }
    }

    public void flush() {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("flush");
        if (impl!=null) {
            impl.__get__(this,self_type).__call__();
        } else {
            super.flush();
        }
    }

    public void close() {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("close");
        if (impl!=null) {
            impl.__get__(this,self_type).__call__();
        } else {
            super.close();
        }
    }

    public boolean seekable() {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("seekable");
        if (impl!=null) {
            return impl.__get__(this,self_type).__call__().__nonzero__();
        } else {
            return super.seekable();
        }
    }

    public void _checkSeekable(String msg) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("_checkSeekable");
        if (impl!=null) {
            PyObject pymsg=msg==null?Py.None:new PyUnicode(msg);
            impl.__get__(this,self_type).__call__(pymsg);
        } else {
            super._checkSeekable(msg);
        }
    }

    public boolean readable() {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("readable");
        if (impl!=null) {
            return impl.__get__(this,self_type).__call__().__nonzero__();
        } else {
            return super.readable();
        }
    }

    public void _checkReadable(String msg) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("_checkReadable");
        if (impl!=null) {
            PyObject pymsg=msg==null?Py.None:new PyUnicode(msg);
            impl.__get__(this,self_type).__call__(pymsg);
        } else {
            super._checkReadable(msg);
        }
    }

    public boolean writable() {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("writable");
        if (impl!=null) {
            return impl.__get__(this,self_type).__call__().__nonzero__();
        } else {
            return super.writable();
        }
    }

    public void _checkWritable(String msg) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("_checkWritable");
        if (impl!=null) {
            PyObject pymsg=msg==null?Py.None:new PyUnicode(msg);
            impl.__get__(this,self_type).__call__(pymsg);
        } else {
            super._checkWritable(msg);
        }
    }

    // Note that closed is a property not a predicate, so no derived method.

    public void _checkClosed(String msg) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("_checkClosed");
        if (impl!=null) {
            PyObject pymsg=msg==null?Py.None:new PyUnicode(msg);
            impl.__get__(this,self_type).__call__(pymsg);
        } else {
            super._checkClosed(msg);
        }
    }

    public boolean __exit__(PyObject type,PyObject value,PyObject traceback) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("__exit__");
        if (impl!=null) {
            return impl.__get__(this,self_type).__call__(type,value,traceback).__nonzero__();
        } else {
            return super.__exit__(type,value,traceback);
        }
    }

    public boolean isatty() {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("isatty");
        if (impl!=null) {
            return impl.__get__(this,self_type).__call__().__nonzero__();
        } else {
            return super.isatty();
        }
    }

    public PyObject readline() {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("readline");
        if (impl!=null) {
            return impl.__get__(this,self_type).__call__(Py.None);
        } else {
            return super.readline();
        }
    }

    public PyObject readline(int limit) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("readline");
        if (impl!=null) {
            return impl.__get__(this,self_type).__call__(Py.newInteger(limit));
        } else {
            return super.readline(limit);
        }
    }

    public PyObject readlines(PyObject hint) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("readlines");
        if (impl!=null) {
            PyObject res=impl.__get__(this,self_type).__call__(hint);
            return res;
        } else {
            return super.readlines(hint);
        }
    }

    public void writelines(PyObject lines) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("writelines");
        if (impl!=null) {
            impl.__get__(this,self_type).__call__(lines);
        } else {
            super.writelines(lines);
        }
    }

    public PyObject readall() {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("readall");
        if (impl!=null)
            return impl.__get__(this,self_type).__call__();
        return super.readall();
    }

    // Hand-crafted in _io._RawIOBase.derived

    public PyObject read(int n) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("read");
        if (impl!=null) {
            return impl.__get__(this,self_type).__call__(Py.newInteger(n));
        } else {
            return super.read(n);
        }
    }

    public PyObject readinto(PyObject b) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("readinto");
        if (impl!=null) {
            return impl.__get__(this,self_type).__call__(b);
        } else {
            return super.readinto(b);
        }
    }

    public PyObject write(PyObject b) {
        PyType self_type=getType();
        PyObject impl=self_type.lookup("write");
        if (impl!=null) {
            return impl.__get__(this,self_type).__call__(b);
        } else {
            return super.write(b);
        }
    }

}
