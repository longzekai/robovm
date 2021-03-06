/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.security;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 8.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/SecAccessControlCreateFlags/*</name>*/ extends Bits</*<name>*/SecAccessControlCreateFlags/*</name>*/> {
    /*<values>*/
    public static final SecAccessControlCreateFlags None = new SecAccessControlCreateFlags(0L);
    public static final SecAccessControlCreateFlags UserPresence = new SecAccessControlCreateFlags(1L);
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final SecAccessControlCreateFlags TouchIDAny = new SecAccessControlCreateFlags(2L);
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final SecAccessControlCreateFlags TouchIDCurrentSet = new SecAccessControlCreateFlags(8L);
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final SecAccessControlCreateFlags DevicePasscode = new SecAccessControlCreateFlags(16L);
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final SecAccessControlCreateFlags Or = new SecAccessControlCreateFlags(16384L);
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final SecAccessControlCreateFlags And = new SecAccessControlCreateFlags(32768L);
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final SecAccessControlCreateFlags PrivateKeyUsage = new SecAccessControlCreateFlags(1073741824L);
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final SecAccessControlCreateFlags ApplicationPassword = new SecAccessControlCreateFlags(-2147483648L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/SecAccessControlCreateFlags/*</name>*/[] values = _values(/*<name>*/SecAccessControlCreateFlags/*</name>*/.class);

    public /*<name>*/SecAccessControlCreateFlags/*</name>*/(long value) { super(value); }
    private /*<name>*/SecAccessControlCreateFlags/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/SecAccessControlCreateFlags/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/SecAccessControlCreateFlags/*</name>*/(value, mask);
    }
    protected /*<name>*/SecAccessControlCreateFlags/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/SecAccessControlCreateFlags/*</name>*/[] values() {
        return values.clone();
    }
}
