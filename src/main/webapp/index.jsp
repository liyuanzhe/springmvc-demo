<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <script type="text/javascript" src="http://ajax.microsoft.com/ajax/jquery
/jquery-1.4.min.js"></script>
    <link href="http://libs.baidu.com/bootstrap/2.3.2/css/bootstrap.min.css" rel="stylesheet">
    <script src="http://libs.baidu.com/bootstrap/2.3.2/js/bootstrap.min.js"></script>
    <script>
$(document).ready(function(){
  $("p").click(function(){
  $(this).hide();
  });
});
</script>
</head>

<body>
    <div class="navbar">
      <div class="navbar-inner">
        <a class="brand" href="#">Title</a>
        <ul class="nav">
          <li class="active"><a href="#">Home</a></li>
          <li><a href="#">Link</a></li>
          <li><a href="#">Link</a></li>
        </ul>
      </div>
    </div>
    <div>
        <button>send http</button>
    </div>


</body>
    <script>
        $(document).ready(function(){
          $("button").click(function(){
            $.get("/ping",function(data,status){
              alert("data：" + data + "\n status：" + status);
            });
          });
        });
    </script>
</html>
