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
        <li role="presentation" class="active"><a href="#">Home</a></li>
        <li role="presentation"><a href="#">学院</a></li>
        <li role="presentation"><a href="#">系</a></li>
      </ul>

      <div style="float:left;width:15%;padding:10px;">
          <ul class="list-group" id="schoollist"></ul>
      </div>

      <div style="float:left;width:85%;padding:10px">
        <div>
          <table class="table table-hover" id="schooltable">
            <tr><td style="display:none">id</td><td>简称</td><td>全称</td><td>操作</td></tr>
          </table>
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
                        <button type="button" class="btn btn-primary"  onclick="update()" data-dismiss="modal">保存</button>
                    </div>
                </div>
            </div>
        </div>
      </div>


    <script src="http://apps.bdimg.com/libs/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    <script type="text/javascript">

      // 系列表
      var departmentList = [
        {name:"计算机科学系",short:"计算机系",id:1},
        {name:"电力系统与电气工程系",short:"电气系",id:2},
        {name:"自动化巴拉巴拉系",short:"自动化系",id:3},
      ];

      var schoolList = [
        {name:"机械与动力工程学院", short:"机械学院", id:1},
        {name:"电子信息与电气工程学院", short:"电信学院", id:2},
        {name:"船舶与建筑学院学院", short:"船建学院", id:3},
        {name:"安泰经济与管理学院", short:"安泰学院", id:4},
      ];

      var loadDepartment = function(){
        var table = $("#schooltable");
        table.children().remove();
        table.append("<tr><td style='hidden:true'>id</td><td>简称</td><td>全称</td><td>操作</td></tr>");
        for(var i=0; i<departmentList.length; i++){
          var department = departmentList[i];
          table.append("<tr><td style='hidden:true'>" + department.id + "</td><td>" + department.short + "</td><td>" + department.name + "</td>"
            + "<td style='color:#f00;cursor:pointer;' onclick='editInfo(this)'>修改</td>");
        }
      }

      var loadSchool = function(){
          var list = $("#schoollist");
          $.get("school/all.do", function(data, status){
            for(var i=0; i<data.length; i++){
                var school = data[i];
                if(i == 0){
                  list.append("<a class='list-group-item active' onclick='clickschool(this)'>" + school.shortName+ "</a>");
                }else{
                  list.append("<a class='list-group-item' onclick='clickschool(this)'>" + school.shortName+ "</a>");
                }
              }
          });
      }

      // 点击学院事件
      var clickschool = function(obj){
        var item = $(obj);
        $("#schoollist").children().removeClass("active");
        item.addClass("active");
        loadDepartment();
      }

      //触发模态框的同时调用此方法
      function editInfo(obj) {
          var tds= $(obj).parent().find('td');
          $('#name').val(tds.eq(2).text());
          $('#shortname').val(tds.eq(1).text());
          $('#id').val(tds.eq(0).text());
          // var sex = $('#sex').val(tds.eq(2).text());
          // if (sex == '女') {
          //     document.getElementById('women').checked = true;
          // } else {
          //     document.getElementById('man').checked = true;
          // }
          $('#modal').modal('show');
      }

      //提交更改
      function update() {
          //获取模态框数据
          var name = $('#name').val();
          var shortname = $('#shortname').val();
          var id = $('#id').val();
          for(var i=0; i<departmentList.length; i++){
            if(departmentList[i].id == id){
              departmentList[i].name = name;
              departmentList[i].shortname = shortname;
            }
          };
          loadDepartment();
          // $('#modal').modal('hide');
      }

      $(document).ready(function(){
        loadSchool();
        loadDepartment();
        $("button").click(function(){
          $('#modal').modal('show');
        });
      });
    </script>
  </body>
</html>

