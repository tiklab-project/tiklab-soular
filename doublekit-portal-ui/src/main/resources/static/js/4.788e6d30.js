(window.webpackJsonp=window.webpackJsonp||[]).push([[4],{810:function(e,t,n){"use strict";n.r(t);var a=n(41),r=n.n(a),c=(n(35),n(31)),i=(n(36),n(28)),s=n(113),o=n.n(s),u=n(27),l=n.n(u),p=n(47),f=n.n(p),d=n(0),m=n.n(d),b=n(64),k=n.n(b),v=n(24),w=n.n(v),x=n(30),E=new function e(){k()(this,e),w()(this,"createWorkAppLink",function(){var e=o()(f.a.mark((function e(t){var n;return f.a.wrap((function(e){for(;;)switch(e.prev=e.next){case 0:return e.next=2,x.Axios.post("/workAppLink/createWorkAppLink",t);case 2:return n=e.sent,e.abrupt("return",n);case 4:case"end":return e.stop()}}),e)})));return function(t){return e.apply(this,arguments)}}()),w()(this,"getWorkList",o()(f.a.mark((function e(){var t;return f.a.wrap((function(e){for(;;)switch(e.prev=e.next){case 0:return e.next=2,x.Axios.post("/workAppLink/findWorkAppLinkList",{});case 2:if((t=e.sent).code){e.next=5;break}return e.abrupt("return",t.data);case 5:return e.abrupt("return",[]);case 6:case"end":return e.stop()}}),e)})))),w()(this,"findWorkByID",function(){var e=o()(f.a.mark((function e(t){var n,a;return f.a.wrap((function(e){for(;;)switch(e.prev=e.next){case 0:return(n=new FormData).append("id",t),e.next=4,x.Axios.post("/workAppLink/findWorkAppLink",n);case 4:if((a=e.sent).code){e.next=7;break}return e.abrupt("return",a.data);case 7:return e.abrupt("return",{});case 8:case"end":return e.stop()}}),e)})));return function(t){return e.apply(this,arguments)}}()),w()(this,"deleteWorkByID",function(){var e=o()(f.a.mark((function e(t){var n,a;return f.a.wrap((function(e){for(;;)switch(e.prev=e.next){case 0:return(n=new FormData).append("id",t),e.next=4,x.Axios.post("/workAppLink/deleteWorkAppLink",n);case 4:return a=e.sent,e.abrupt("return",a);case 6:case"end":return e.stop()}}),e)})));return function(t){return e.apply(this,arguments)}}()),w()(this,"updateWork",function(){var e=o()(f.a.mark((function e(t){var n;return f.a.wrap((function(e){for(;;)switch(e.prev=e.next){case 0:return e.next=2,x.Axios.post("/workAppLink/updateWorkAppLink",t);case 2:return n=e.sent,e.abrupt("return",n);case 4:case"end":return e.stop()}}),e)})));return function(t){return e.apply(this,arguments)}}())},h=(n(77),n(71)),y=n(225),O=(n(43),n(38)),g=(n(114),n(66)),j=(n(104),n(81)),A=(n(72),n(69));function L(e,t){var n=Object.keys(e);if(Object.getOwnPropertySymbols){var a=Object.getOwnPropertySymbols(e);t&&(a=a.filter((function(t){return Object.getOwnPropertyDescriptor(e,t).enumerable}))),n.push.apply(n,a)}return n}function N(e){for(var t=1;t<arguments.length;t++){var n=null!=arguments[t]?arguments[t]:{};t%2?L(Object(n),!0).forEach((function(t){w()(e,t,n[t])})):Object.getOwnPropertyDescriptors?Object.defineProperties(e,Object.getOwnPropertyDescriptors(n)):L(Object(n)).forEach((function(t){Object.defineProperty(e,t,Object.getOwnPropertyDescriptor(n,t))}))}return e}var W=function(e){var t=e.visible,n=e.setVisible,a=e.callBack,c=e.edit,i=A.default.useForm(),s=l()(i,1)[0];Object(d.useEffect)((function(){c&&s.setFieldsValue({appType:c.appType,appUrl:c.appUrl})}),[c]);return m.a.createElement(h.default,{title:"添加项目",visible:t,onOk:function(){s.submit()},onCancel:function(){s.resetFields(),a(),n(!1)},closable:!1,destroyOnClose:!0,preserve:!1},m.a.createElement(A.default,r()({},{labelCol:{span:6},wrapperCol:{span:18}},{form:s,onFinish:function(e){c?E.updateWork(N(N({},e),{},{id:c.id})).then((function(e){e.code?j.default.error("失败!"):(j.default.success("成功!"),a(),n(!1))})):E.createWorkAppLink(e).then((function(e){e.code?j.default.error("失败!"):(j.default.success("成功!"),a(),n(!1))}))}}),m.a.createElement(A.default.Item,{label:"标题",name:"appType",rules:[{required:!0,message:"用户名不能包含非法字符，如&,%，&，#……等"}]},m.a.createElement(g.default,{options:[{label:"项目管理",value:"project"},{label:"API BOX",value:"apibox"}]})),m.a.createElement(A.default.Item,{label:"应用链接地址",name:"appUrl",rules:[{required:!0,message:"请填写地址"}]},m.a.createElement(O.default,null))))},C={apibox:{label:"API BOX"},project:{label:"项目管理"}},P=function(e){var t=e.visibleManagement,n=e.setVisibleManagement,a=e.workList,s=e.requestWorkList,u=Object(d.useState)(!1),p=l()(u,2),b=p[0],k=p[1],v=Object(d.useState)(null),w=l()(v,2),x=w[0],O=w[1],g=function(){var e=o()(f.a.mark((function e(t){return f.a.wrap((function(e){for(;;)switch(e.prev=e.next){case 0:return e.next=2,E.deleteWorkByID(t);case 2:e.sent.code||s();case 4:case"end":return e.stop()}}),e)})));return function(t){return e.apply(this,arguments)}}();return m.a.createElement(h.default,{title:"应用链接管理",visible:t,onOk:function(){s(),n(!1)},onCancel:function(){n(!1)},closable:!1,destroyOnClose:!0},m.a.createElement(c.default,null,m.a.createElement(i.default,{span:24,style:{overflow:"auto"}},m.a.createElement("div",{className:"title"},"default"),m.a.createElement("div",{className:"box-gather"},a.map((function(e){return m.a.createElement("div",{className:"box-item",key:e.id},m.a.createElement("div",{className:"box-icon management"},C[e.appType].label,m.a.createElement("div",{className:"action"},m.a.createElement("span",{onClick:function(){return O(e),void k(!0)}},"编辑"),m.a.createElement("span",{onClick:function(){return g(e.id)}},"删除"))))})),m.a.createElement("div",{className:"box-item",onClick:function(){k(!0)}},m.a.createElement("div",{className:"box-icon"},m.a.createElement(y.a,{className:{fontSize:20}})))))),m.a.createElement(W,r()({},e,{edit:x,visible:b,setVisible:k,callBack:function(){O(null),s()}})))},D={apibox:{label:"API BOX"},project:{label:"项目管理"}};t.default=function(e){var t=Object(d.useState)([]),n=l()(t,2),a=n[0],s=n[1],u=Object(d.useState)(!1),p=l()(u,2),b=p[0],k=p[1];Object(d.useEffect)((function(){w().then((function(e){}))}),[]);var v=function(e){k(!0)},w=function(){var e=o()(f.a.mark((function e(){var t;return f.a.wrap((function(e){for(;;)switch(e.prev=e.next){case 0:return e.next=2,E.getWorkList();case 2:t=e.sent,s(t);case 4:case"end":return e.stop()}}),e)})));return function(){return e.apply(this,arguments)}}();return m.a.createElement(m.a.Fragment,null,m.a.createElement(c.default,{justify:"center",style:{width:"100%"}},m.a.createElement(i.default,{xl:{span:24},xxl:{span:16}},m.a.createElement("div",{className:"title"},"default",m.a.createElement("span",{className:"head-action",onClick:function(){return v()}},"管理")),m.a.createElement("div",{className:"box-gather"},a.map((function(e){return m.a.createElement("div",{className:"box-item",key:e.id},m.a.createElement("div",{className:"box-icon"},m.a.createElement("a",{href:e.appUrl,target:"_blank"}," ",D[e.appType].label)))}))))),0===a.length&&m.a.createElement(c.default,{justify:"center",style:{width:"100%"}},m.a.createElement(i.default,{xl:{span:24},xxl:{span:16}},m.a.createElement("div",{className:"title"},"default",m.a.createElement("span",{className:"head-action",onClick:function(){return v()}},"管理")),m.a.createElement("div",{className:"box-gather"}))),m.a.createElement(P,r()({},e,{workList:a,requestWorkList:function(){w().then((function(e){}))},visibleManagement:b,setVisibleManagement:k})))}}}]);