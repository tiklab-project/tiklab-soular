(window.webpackJsonp=window.webpackJsonp||[]).push([[26],{455:function(e,t,r){"use strict";r.d(t,"a",(function(){return l}));r(405);var a=r(404),n=r(0),c=r.n(n),i=r(185),l=function(e){var t=e.routes;return c.a.createElement("div",{className:"privilege-breadcrumb"},c.a.createElement(a.a,{itemRender:function(e,t,r,a){var n=r.indexOf(e)===r.length-1;return e.disabled?c.a.createElement("span",null,e.breadcrumbName):n?e.click?c.a.createElement("span",{style:{cursor:"pointer"},onClick:function(){return e.click()}},e.breadcrumbName):c.a.createElement("span",null,e.breadcrumbName):e.click?c.a.createElement("span",{style:{cursor:"pointer"},onClick:function(){return e.click()}},e.breadcrumbName):c.a.createElement(i.b,{to:e.path},e.breadcrumbName)},routes:t,separator:">"}))}},463:function(e,t,r){},502:function(e,t,r){},667:function(e,t,r){"use strict";r.r(t);r(502);var a=r(501),n=(r(271),r(82)),c=(r(64),r(22)),i=(r(272),r(51)),l=(r(420),r(418)),u=(r(463),r(455)),o=r(0),s=r.n(o),d=r(443),m=r(6),f=r(646);function p(e,t){return function(e){if(Array.isArray(e))return e}(e)||function(e,t){var r=null==e?null:"undefined"!=typeof Symbol&&e[Symbol.iterator]||e["@@iterator"];if(null==r)return;var a,n,c=[],i=!0,l=!1;try{for(r=r.call(e);!(i=(a=r.next()).done)&&(c.push(a.value),!t||c.length!==t);i=!0);}catch(e){l=!0,n=e}finally{try{i||null==r.return||r.return()}finally{if(l)throw n}}return c}(e,t)||function(e,t){if(!e)return;if("string"==typeof e)return b(e,t);var r=Object.prototype.toString.call(e).slice(8,-1);"Object"===r&&e.constructor&&(r=e.constructor.name);if("Map"===r||"Set"===r)return Array.from(e);if("Arguments"===r||/^(?:Ui|I)nt(?:8|16|32)(?:Clamped)?Array$/.test(r))return b(e,t)}(e,t)||function(){throw new TypeError("Invalid attempt to destructure non-iterable instance.\nIn order to be iterable, non-array objects must have a [Symbol.iterator]() method.")}()}function b(e,t){(null==t||t>e.length)&&(t=e.length);for(var r=0,a=new Array(t);r<t;r++)a[r]=e[r];return a}var E=function(){var e=p(Object(o.useState)([]),2),t=e[0],r=e[1],b=Object(f.a)((function(e){return e.pluginStore}));Object(o.useEffect)((function(){return E(),function(){return r([])}}),[]);var E=function(){var e={ids:["1"]};try{"mult"===tenant_type&&(e={ids:["0","1"]})}catch(t){e={ids:["1"]}}m.Axios.post("/user/userdir/findDirByIds",e).then((function(e){if(!e.code){var t=e.data;r(t)}}))};return s.a.createElement(n.a,{className:"d-wrap"},s.a.createElement(i.a,{span:24},s.a.createElement(u.a,{routes:[{disabled:!0,breadcrumbName:"目录管理"}]}),s.a.createElement("div",{className:"d"},t.map((function(e){return s.a.createElement(n.a,{justify:"space-around",align:"middle",key:e.id},s.a.createElement(i.a,{span:6,style:{padding:16}},s.a.createElement("div",{className:"d-wrap"},s.a.createElement(l.a,{size:64,icon:s.a.createElement(d.a,null)}),s.a.createElement("div",{className:"d-wrap-content"},s.a.createElement("div",null,e.name)))),s.a.createElement(i.a,{span:12},s.a.createElement("div",{className:"d-actions"},s.a.createElement(c.a,{disabled:!0},"同步数据"),s.a.createElement(c.a,{disabled:!0},"开启"),s.a.createElement(c.a,{disabled:!0},"禁止"),s.a.createElement(c.a,{disabled:!0},"配置"))))})),s.a.createElement(a.a,{point:"directory",pluginStore:b,isModalType:!0}))))};t.default=function(e){return s.a.createElement(E,e)}}}]);