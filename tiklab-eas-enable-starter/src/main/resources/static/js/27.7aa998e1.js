(window.webpackJsonp=window.webpackJsonp||[]).push([[27],{474:function(e,t,n){"use strict";n.d(t,"a",(function(){return r}));var r=function(e){return function(t,n){return Object.entries(t instanceof Object?t:(r={},a=t,i=t,a in r?Object.defineProperty(r,a,{value:i,enumerable:!0,configurable:!0,writable:!0}):r[a]=i,r)).filter((function(e){return!1!==e[1]})).map((function(e){return e[0]})).map((function(t){return[e,t].filter(Boolean).join("-")})).concat(n&&n.extra||[]).join(" ");var r,a,i}}},498:function(e,t,n){"use strict";n.d(t,"c",(function(){return s})),n.d(t,"a",(function(){return u})),n.d(t,"b",(function(){return c}));var r=n(425),a=n(418),i=n(0),l=n.n(i),c=[{id:"1",key:"1",title:"组织管理",purviewCode:"sys_orga",icon:l.a.createElement(a.a,null)},{id:"2",key:"2",title:"用户管理",purviewCode:"sys_user",icon:l.a.createElement(r.a,null)},{id:"4",key:"4",title:"用户目录",purviewCode:"sys_directory",icon:l.a.createElement(r.a,null)}],s=[{id:"1",title:"系统权限",purviewCode:"sys_permission",icon:l.a.createElement(r.a,null),children:[{id:"1-1",title:"功能管理",purviewCode:"sys_feature",icon:l.a.createElement(r.a,null)},{id:"1-2",title:"角色管理",purviewCode:"sys_role",icon:l.a.createElement(r.a,null)}]},{id:"3",title:"消息中心",purviewCode:"sys_message_center",icon:l.a.createElement(r.a,null),children:[{id:"3-1",title:"消息管理",icon:l.a.createElement(r.a,null),purviewCode:"sys_message_management"},{id:"3-2",title:"消息类型管理",icon:l.a.createElement(r.a,null),purviewCode:"sys_message_type_management"},{id:"3-3",title:"消息发送方式",icon:l.a.createElement(r.a,null),purviewCode:"sys_message_type"},{id:"3-4",title:"消息模板管理",icon:l.a.createElement(r.a,null),purviewCode:"sys_message_template"}]},{id:"4",key:"4",purviewCode:"plugin",title:"插件管理",icon:l.a.createElement(a.a,null)},{id:"5",key:"5",purviewCode:"license",title:"License管理",icon:l.a.createElement(a.a,null)},{id:"6",key:"6",purviewCode:"widget",title:"Widget管理",icon:l.a.createElement(a.a,null)}],u=function(e,t){switch(t){case"1-1":e.push("/system/feature");break;case"1-2":e.push("/system/role");break;case"3-1":e.push("/system/message");break;case"3-2":e.push("/system/messagetype");break;case"3-3":e.push("/system/messagesendtype");break;case"3-4":e.push("/system/messagetemplate");break;case"4":e.push("/system/plugin");break;case"5":e.push("/system/license");break;case"6":e.push("/system/widgetMangent")}}},499:function(e,t,n){"use strict";n.d(t,"a",(function(){return m}));n(281);var r=n(56),a=n(0),i=n.n(a),l=n(66),c=n(474);function s(e,t){return function(e){if(Array.isArray(e))return e}(e)||function(e,t){var n=null==e?null:"undefined"!=typeof Symbol&&e[Symbol.iterator]||e["@@iterator"];if(null==n)return;var r,a,i=[],l=!0,c=!1;try{for(n=n.call(e);!(l=(r=n.next()).done)&&(i.push(r.value),!t||i.length!==t);l=!0);}catch(e){c=!0,a=e}finally{try{l||null==n.return||n.return()}finally{if(c)throw a}}return i}(e,t)||function(e,t){if(!e)return;if("string"==typeof e)return u(e,t);var n=Object.prototype.toString.call(e).slice(8,-1);"Object"===n&&e.constructor&&(n=e.constructor.name);if("Map"===n||"Set"===n)return Array.from(e);if("Arguments"===n||/^(?:Ui|I)nt(?:8|16|32)(?:Clamped)?Array$/.test(n))return u(e,t)}(e,t)||function(){throw new TypeError("Invalid attempt to destructure non-iterable instance.\nIn order to be iterable, non-array objects must have a [Symbol.iterator]() method.")}()}function u(e,t){(null==t||t>e.length)&&(t=e.length);for(var n=0,r=new Array(t);n<t;n++)r[n]=e[n];return r}var o=r.a.SubMenu,d=Object(c.a)("privilege-header"),m=Object(l.c)((function(e){var t=e.className,n=e.onSelectMenu,l=(e.allPromise,s(Object(a.useState)(e.defaultSelectedKeys||[]),2)),c=l[0],u=l[1];return i.a.createElement("div",{className:d("menu",{extra:[t].join(" ")})},i.a.createElement(r.a,{theme:"light",mode:"inline",className:"menu-wrap",defaultSelectedKeys:e.defaultSelectedKeys,defaultOpenKeys:e.defaultOpenKeys,selectedKeys:c,onSelect:function(e){u([e.key]),n(e)}},function e(){var t=arguments.length>0&&void 0!==arguments[0]?arguments[0]:[];return t.map((function(t,n){return t.children&&t.children.length?i.a.createElement(o,{key:"".concat(t.id),title:t.title,icon:t.icon},e(t.children)):i.a.createElement(a.Fragment,{key:"".concat(t.id)},t.divider&&i.a.createElement(r.a.Divider,null),i.a.createElement(r.a.Item,{icon:t.icon,key:"".concat(t.id)},t.title))}))}(e.data)))}))},504:function(e,t,n){},660:function(e,t,n){"use strict";n.r(t);n(504);var r=n(499),a=n(0),i=n.n(a),l=n(66),c=n(202),s=n(88),u=n(498);t.default=Object(l.b)(s.a)(Object(l.c)((function(e){var t=e.history,n=e.route,a=e.systemRoleStore;return i.a.createElement("div",{style:{display:"flex",height:"100%"}},i.a.createElement(r.a,{data:u.c,onSelectMenu:function(e){var n=e.key;Object(u.a)(t,n)},defaultSelectedKeys:["1-1"],defaultOpenKeys:["1"],allPromise:a.systemPermissions}),i.a.createElement("div",{style:{width:"100%"}},Object(c.a)(n.routes)))})))}}]);