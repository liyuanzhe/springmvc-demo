<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <script type="text/javascript" src="http://ajax.microsoft.com/ajax/jquery
/jquery-1.4.min.js"></script>
    <script>
$(document).ready(function(){
  $("p").click(function(){
  $(this).hide();
  });
});
</script>
</head>

<html>
<head>
    <script src="/jquery/jquery-1.11.1.min.js"></script>
    <script>
        $(document).ready(function(){
          $("button").click(function(){
            $.get("/myfirstweb/ping",function(data,status){
              alert("data：" + data + "\n status：" + status);
            });
          });
        });
    </script>
</head>
<body>

<button>send http</button>
<div>
<img src="static/img/timg.jpg"/>
</div>
</body>
</html>
</html>
