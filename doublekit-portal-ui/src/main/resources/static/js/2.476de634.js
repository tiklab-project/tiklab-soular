(window.webpackJsonp=window.webpackJsonp||[]).push([[2],{790:function(e,t,r){"use strict";r.d(t,"c",(function(){return a})),r.d(t,"a",(function(){return c})),r.d(t,"b",(function(){return n}));var i=r(499),s=r(498),u=r(0),o=r.n(u),n=[{id:"1",key:"1",title:"组织管理",purviewCode:"s",icon:o.a.createElement(i.a,null)},{id:"2",key:"2",title:"用户管理",purviewCode:"c",icon:o.a.createElement(s.a,null)},{id:"3",key:"3",title:"项目成员管理",purviewCode:"project-people"}],a=[{id:"1",title:"系统权限",purviewCode:"system",children:[{id:"1-1",title:"功能管理",purviewCode:"privilege_feature"},{id:"1-2",title:"角色管理",purviewCode:"role-custom"}]},{id:"2",title:"项目权限",purviewCode:"project",children:[{id:"2-1",title:"功能管理",purviewCode:"privilege_feature"},{id:"2-2",title:"角色管理",purviewCode:"role-custom"},{id:"2-3",title:"项目角色管理",divider:!0,purviewCode:"project-role-custom"}]},{id:"3",title:"消息中心",children:[{id:"3-1",title:"消息管理",purviewCode:"message-management"},{id:"3-2",title:"消息模板管理",purviewCode:"message-template"},{id:"3-3",title:"消息发送方式",purviewCode:"message-type"},{id:"3-4",title:"消息类型管理",purviewCode:"message-service"}]}],c=function(e,t){switch(t){case"1-1":e.push("/system/feature");break;case"1-2":e.push("/system/role");break;case"2-1":e.push("/system/projectfeature");break;case"2-2":e.push("/system/projectrole");break;case"2-3":e.push("/system/projectrolecustom");break;case"3-1":e.push("/system/message");break;case"3-2":e.push("/system/messagetype");break;case"3-3":e.push("/system/messagesendtype");break;case"3-4":e.push("/system/messagetemplate")}}},795:function(e,t,r){"use strict";r.r(t);var i=r(27),s=r.n(i),u=r(0),o=r.n(u),n=r(318),a=r(103),c=r(790),p=r(116);t.default=function(e){var t=function(e,t,r){var i=r.findIndex((function(e){return e.key===t}));e.push(r[i].router)},r=Object(u.useState)(c.b),i=s()(r,2),d=i[0],l=i[1];return Object(u.useEffect)((function(){var e=Object(p.pluginConfig)("pluginNav").filter((function(e){return e.extraProps})).map((function(e){return{id:e.id,key:e.id,title:e.extraProps.title}}));l(c.b.concat(e))}),[p.plugins]),o.a.createElement("div",{style:{display:"flex",height:"100%"}},o.a.createElement(a.MenuList,{data:d,onSelectMenu:function(r){var i=r.key,s=Object(p.pluginConfig)("pluginNav").filter((function(e){return e.extraProps})).map((function(e){return{key:e.id,router:"/"+e.router.mount+e.router.router}})),u=[{key:"1",router:"/orga/dashbord"},{key:"2",router:"/orga/user"},{key:"3",router:"/orga/peojectpeople"}].concat(s);t(e.history,i,u)},defaultSelectedKeys:["2"]}),o.a.createElement("div",{style:{width:"100%"}},Object(n.a)(e.route.routes)))}}}]);