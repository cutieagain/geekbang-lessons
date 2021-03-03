<%--
  Created by IntelliJ IDEA.
  User: cutie
  Date: 2021-03-03
  Time: 19:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <title>用户注册</title>
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="CSS.css">
    <script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<script>
    function addCheck() {
        var username = document.getElementById("username").value;
        var password = document.getElementById("password").value;
        if (username == "") {
            alert("用户名不能为空!");
            document.getElementById("username").focus();
            return false;
        }
        if (password == "") {
            alert("密码不能为空!");
            document.getElementById("password").focus();
            return false;
        }
    }
    function validate() {
        var flag = addCheck();
        if (flag == false)
            return false;
        return true;
    }
</script>

<body style="background: url(back3.jpg)">
<br>
<br>
<div class="row">
    <div class="col-md-4 col-md-offset-4">
        <div class="panel panel-info">
            <div class="panel-heading">
                <h3 class="text-center">注册新用户</h3>
            </div>
            <div class="panel-body">
                <form class="form-horizontal" role="form" action="register" accept-charset="UTF-8" method="post" onsubmit="return validate()">
                    <input name="utf8" type="hidden" value="&#x2713;" />
                    <input type="hidden" name="authenticity_token" value="cFE0MDKxyoAORTDnrgojEr0WGEMN3S9VYjEFJC10zUOgvHCCWlC1e6BcV7c0p7u/Zgjp8vHqYdDiXenxRJWiIw==" />


                    <div class="form-group">
                        <label class="col-sm-3 control-label">用户名</label>
                        <div class="col-sm-9">
                            <div class="input-group">
                                <div class="input-group-addon">
                                    <span class="glyphicon glyphicon-envelope"></span>
                                </div>
                                <input class="form-control" placeholder="输入您的用户名" type="text" name="username" maxlength="16" onfocus="if(this.value == '输入您的用户名') this.value =''" />
                            </div>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-3 control-label">密码</label>
                        <div class="col-sm-9">
                            <div class="input-group">
                                <div class="input-group-addon">
                                    <span class="glyphicon glyphicon-lock"></span>
                                </div>
                                <input class="form-control" placeholder="输入您的密码" type="password" name="password" maxlength="20" onfocus="if(this.value == '输入您的密码') this.value =''">
                            </div>
                        </div>
                    </div>

                    <input type="submit" name="commit" value="注册" class="btn btn-primary btn-block" />
                    <a class="btn btn-default btn-block" href="/">取消</a>

                </form>
            </div>
        </div>
    </div>

</div>

</body>
</html>