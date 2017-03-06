<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <script type="text/javascript" src="http://ajax.microsoft.com/ajax/jquery/jquery-1.4.min.js"></script>
    <%--<link href="bootstrap-3.3.7/css/bootstrap.min.css" rel="stylesheet">--%>
    <%--<script src="bootstrap-3.3.7/js/bootstrap.min.js"></script>--%>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    <script>
        $(document).ready(function(){
          $("p").click(function(){
          $(this).hide();
          });
        });
    </script>
</head>

<body>

    <div class="list-group">
        <a href="#" class="list-group-item ">
            <table class="table" style="border:none"><tr>
                <td width="25%"><h1 style="font-size:60px">李源哲</h1></td>
                <td ><div>
                    <img src=https://img3.doubanio.com/f/shire/5a2327c04c0c231bced131ddf3f4467eb80c1c86/pics/rating_icons/star_onmouseover.png>
                    <img src=https://img3.doubanio.com/f/shire/5a2327c04c0c231bced131ddf3f4467eb80c1c86/pics/rating_icons/star_onmouseover.png>
                    <span>8.2</span>
                    <p>电信学院 仪器系</p>
                </div></td>
            </tr></table>
        </a>
        <a href="#" class="list-group-item ">
            <table class="table" style="border:none" ><tr>
                <td width="25%"><h1 style="font-size:60px">李源哲</h1></td>
                <td ><div>
                    <img src=https://img3.doubanio.com/f/shire/5a2327c04c0c231bced131ddf3f4467eb80c1c86/pics/rating_icons/star_onmouseover.png>
                    <img src=https://img3.doubanio.com/f/shire/5a2327c04c0c231bced131ddf3f4467eb80c1c86/pics/rating_icons/star_onmouseover.png>
                    <span>7.9</span>
                    <p>电信学院 仪器系</p>
                </div></td>
            </tr></table>
        </a>
        <a href="#" class="list-group-item " style="overflow:hidden">
            <div>
                <img id="img" src="https://img3.doubanio.com/lpic/s11284102.jpg" width="120px" height="120px" style="float:left;padding:10px">
                <div>
                    <h1>李源哲</h1>
                    <img src=https://img3.doubanio.com/f/shire/5a2327c04c0c231bced131ddf3f4467eb80c1c86/pics/rating_icons/star_onmouseover.png>
                    <img src=https://img3.doubanio.com/f/shire/5a2327c04c0c231bced131ddf3f4467eb80c1c86/pics/rating_icons/star_onmouseover.png>
                    <span>7.9</span>
                    <p>电信学院 仪器系</p>
                </div>
            </div>
        </a>
    </div>


    <div>
        <table class="table" id="table">
        </table>
    </div>

</body>
    <script>
        $(document).ready(function(){
            $.get("/table", function(data, status){
                for(var i=0; i<data.length; i++){
                    var tb = data[i];
                    $("#table").append("<tr><td>" + tb.id +"</td><td>"+tb.name+"</td></tr>");
                }
            })
        });
    </script>
</html>
