/* Copyright 2004 Acegi Technology Pty Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.sf.acegisecurity.providers.dao.event;

import net.sf.acegisecurity.Authentication;
import net.sf.acegisecurity.UserDetails;


/**
 * Application event which indicates authentication failure due to nonexistent
 * username. <code>AuthenticationFailureUsernameNotFoundEvent.getUser()</code>
 * returns an instance of <code>User</code>, where the username is filled by
 * the <code>String</code> provided at login attempt. The other properties are
 * set to non-<code>null</code> values without any meaning.
 *
 * @author Karel Miarka
 */
public class AuthenticationFailureUsernameNotFoundEvent
    extends AuthenticationEvent {
    //~ Constructors ===========================================================

    //  ~ Constructors ===========================================================
    public AuthenticationFailureUsernameNotFoundEvent(
        Authentication authentication, UserDetails user) {
        super(authentication, user);
    }
}
