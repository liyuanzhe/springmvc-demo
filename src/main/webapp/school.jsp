    <%@ page contentType="text/html;charset=UTF-8" %>
        <!doctype html>
        <html>
        <head>
        <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
        <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

        <!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
        <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

        </head>

        <body>

        <div class="container">

        <!-- 导航 -->
        <ul class="nav nav-pills">
        <li role="presentation" class="active"><a href="index.jsp">Home</a></li>
        <li role="presentation"><a href="school.jsp">学院</a></li>
        <li role="presentation"><a href="#">系</a></li>
        </ul>

        <div style="padding:10px;">
            <ul class="list-group" id="schoollist"></ul>
        </div>

        <!--模态窗口 -->
        <div class="modal fade" id="modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
            <div class="modal-dialog" role="document">
            <div class="modal-content">
            <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">×</span>
            </button>
            <h4 class="modal-title" id="myModalLabel">模态窗口</h4>
            </div>
            <div class="modal-body modal-li">
            <form>
            <ul>
            <li>
            <label for="name">全称</label>
            <input type="text" class="form-control text-input" id="name" placeholder="请输入姓名">
            </li>
            <li>
            <label for="name">缩写</label>
            <input type="text" class="form-control text-input" id="shortname" placeholder="请输入缩写">
            </li>
            <li>
            <label for="name">id</label>
            <input type="text" class="form-control text-input" id="id" placeholder="id">
            </li>
            <li hidden="true">
            <label for="name">id</label>
            <input type="text" class="form-control text-input" id="schoolid" placeholder="schoolid">
            </li>
            <!-- <li>
            <label for="name">性别</label>
            <input type="radio" name="sex" id="man" value="男" style="margin-left:10px;"/>男
            <input type="radio" name="sex" id="women" value="女" style="margin-left:10px;"/>女
            </li> -->
            </ul>
            </form>
            </div>
            <div class="modal-footer">
            <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
            <button type="button" class="btn btn-default"  onclick="update()" data-dismiss="modal">修改</button>
            <button type="button" class="btn btn-default"  onclick="insert()" data-dismiss="modal">新建</button>
            <button type="button" class="btn btn-default"  onclick="deleteSchool()" data-dismiss="modal">删除</button>
            </div>
            </div>
            </div>
        </div>

        <div class="button" style="padding:10px;">
            <button class="btn btn-default" onclick="editInfo(null)">新建</button>
        </div>

        </div>

        <script src="http://apps.bdimg.com/libs/jquery/2.1.1/jquery.min.js"></script>
        <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <script type="text/javascript">

        var schoolList = [
        {name:"机械与动力工程学院", short:"机械学院", id:1},
        {name:"电子信息与电气工程学院", short:"电信学院", id:2},
        {name:"船舶与建筑学院学院", short:"船建学院", id:3},
        {name:"安泰经济与管理学院", short:"安泰学院", id:4},
        ];


        // 请求并加载学院列表
        var loadSchool = function(){
            var list = $("#schoollist");
            list.children().remove();
            $.get("school/all.do", function(data, status){
            schoolList = data;
            for(var i=0; i<data.length; i++){
                var school = data[i];
                list.append("<a class='list-group-item' onclick='editInfo(this)'>" + school.shortName+ "<span hidden='true'>" + school.id + "</span>" + "</a>");
            }
            });
        }

        //触发模态框的同时调用此方法
        function editInfo(obj) {
            var schoolId = $(obj).find('span').text();
            var school;
            for(var i=0; i<schoolList.length; i++){
                if(schoolId == schoolList[i].id){
                    school = schoolList[i];
                }
            }

            if(obj != null){
                $('#name').val(school.name);
                $('#shortname').val(school.shortName);
                $('#id').val(school.id);
            }else{
                $('#name').val("");
                $('#shortname').val("");
                $('#id').val("");
            }
            $('#modal').modal('show');
        }

        //提交更改
        function update() {
            //获取模态框数据
            var school = {name:null, shortName:null, id:null};
            school.name = $('#name').val();
            school.shortName = $('#shortname').val();
            school.id = $('#id').val();
            $.post("school/update.do", school, function(data, status){
                loadSchool();
            });
        }

        function deleteSchool(){
            var id = $('#id').val();
            $.get("school/delete.do?id="+id, function(data, status){
                loadSchool();
            });
        }

        function insert(){
            //获取模态框数据
            var name = $('#name').val();
            var shortname = $('#shortname').val();
            $.post("school/insert.do", {name:name, shortName:shortname}, function(data, status){
                loadSchool();
            });
        }

        $(document).ready(function(){
        loadSchool();
        });
        </script>
        </body>
        </html>

