package com.example.echo.smartloginlibrary;

import com.example.echo.smartloginlibrary.users.SmartUser;
import com.example.echo.smartloginlibrary.util.SmartLoginException;

/**
 * Copyright (c) 2017 Codelight Studios
 * Created by kalyandechiraju on 22/04/17.
 */

public interface SmartLoginCallbacks {

    void onLoginSuccess(SmartUser user);

    void onLoginFailure(SmartLoginException e);

    SmartUser doCustomLogin();

    SmartUser doCustomSignup();
}
