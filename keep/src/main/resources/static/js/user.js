layui.define('table',function(exports){
	var table=layui.table;
	table.render({
		elem : '#demo',
		height : 473,
		url : '/user/findUserInfoTable' //数据接口
		,
		page : true //开启分页
		,
		cols : [ [ //表头
		{
			field : 'id',
			title : 'ID',
			width : 80,
			sort : true,
			fixed : 'left'
		}, {
			field : 'name',
			title : '用户名',
			width : 80
		}, {
			field : 'age',
			title : '年龄',
			width : 80,
			sort : true
		}, {
			field : 'tel',
			title : '电话',
			width : 80
		}, {
			field : 'addr',
			title : '住址',
			width : 177
		}, {
			field : 'createdTime',
			title : '创建时间',
			width : 180,
			sort : true
		}, {
			field : 'modifiedTime',
			title : '修改时间',
			width : 180,
			sort : true
		}, {
			field : '',
			title : '操作',
			width : 180,
			toolbar : '#barDemo'
		}

		] ],
		text : {
			none : '加载数据失败'
		}
	});
	table.on('tool(test)', function(res) {
		console.log(res);
		if (res.event === 'edit') {
			layer.open({
				type : 2,
				title : '修改',
				maxmin : true,
				closeBtn : 1,
				shadeClose : true, //点击遮罩关闭层
				area : [ '600px', '320px' ],
				content : 'update'
			});

		}

	})
	exports('user');
});



