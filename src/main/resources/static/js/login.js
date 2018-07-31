function login() {
    var user = document.loginForm.username.value;
    var password = document.loginForm.password.value;
    if(user=="" || password == ""){
        swal("","用户名密码不可为空","info");
       /* swal({
            title: '账号密码不可为空',
            html: $('<div>')
                .addClass('some-class')
                .text('账号密码不可为空'),
            animation: false,
            width:'1000 px',
            customClass: 'animated tada'
        });*/
        return;
    }
    $.ajax({
        //提交数据的类型 POST GET
        type: "POST",
        //提交的网址
        url: "./login",
        //提交的数据
        data: {username: user, password: password},
        //返回数据的格式
       // datatype: "json",//"xml", "html", "script", "json", "jsonp", "text".
        //在请求之前调用的函数
        beforeSend: function () {

            //alert("开始登录")
        },
        //成功返回之后调用的函数
        success: function (data) {
            if(data=="fail"){
                swal("","用户名密码错误","info");
            }else{
                window.location.href="./index";
            }

        },
        //调用执行后调用的函数  优先级高于success
        complete: function (XMLHttpRequest, textStatus) {
            //跳转到主页
            //alert("11111111"+XMLHttpRequest.responseText);
           // alert(textStatus);
            //HideLoading();
        },
        //调用出错执行的函数
        error: function () {
            //请求出错处理
            //alert("请求出错")
        }
    });
}


function alert() {
    swal("","用户名不可为空","error");
}