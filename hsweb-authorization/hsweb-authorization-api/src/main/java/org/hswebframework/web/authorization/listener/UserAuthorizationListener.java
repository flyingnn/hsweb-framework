/*
 * Copyright 2016 http://www.hswebframework.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package org.hswebframework.web.authorization.listener;


import org.hswebframework.web.authorization.Authorization;

/**
 * TODO 完成注释
 *
 * @author zhouhao
 */
public interface UserAuthorizationListener {

    default void onConfig(String username, UserAuthorizationConfigRegister configHolder) {
    }

    default void onAuthorizeBefore(String username) {
    }

    default void onAuthorizeFail(String username) {
    }

    void onAuthorizeSuccess(boolean isRemembered, Authorization authorization);
}
