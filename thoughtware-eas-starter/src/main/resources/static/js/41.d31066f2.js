(window.webpackJsonp=window.webpackJsonp||[]).push([[41],{668:function(t,e){},753:function(t,e,r){"use strict";var n=r(0),o=r.n(n),i=r(14),a=r(202),c=r(226);function u(t){return(u="function"==typeof Symbol&&"symbol"==typeof Symbol.iterator?function(t){return typeof t}:function(t){return t&&"function"==typeof Symbol&&t.constructor===Symbol&&t!==Symbol.prototype?"symbol":typeof t})(t)}function s(){return(s=Object.assign?Object.assign.bind():function(t){for(var e=1;e<arguments.length;e++){var r=arguments[e];for(var n in r)Object.prototype.hasOwnProperty.call(r,n)&&(t[n]=r[n])}return t}).apply(this,arguments)}function f(t,e){var r=Object.keys(t);if(Object.getOwnPropertySymbols){var n=Object.getOwnPropertySymbols(t);e&&(n=n.filter((function(e){return Object.getOwnPropertyDescriptor(t,e).enumerable}))),r.push.apply(r,n)}return r}function l(t){for(var e=1;e<arguments.length;e++){var r=null!=arguments[e]?arguments[e]:{};e%2?f(Object(r),!0).forEach((function(e){O(t,e,r[e])})):Object.getOwnPropertyDescriptors?Object.defineProperties(t,Object.getOwnPropertyDescriptors(r)):f(Object(r)).forEach((function(e){Object.defineProperty(t,e,Object.getOwnPropertyDescriptor(r,e))}))}return t}function h(){/*! regenerator-runtime -- Copyright (c) 2014-present, Facebook, Inc. -- license (MIT): https://github.com/facebook/regenerator/blob/main/LICENSE */h=function(){return e};var t,e={},r=Object.prototype,n=r.hasOwnProperty,o=Object.defineProperty||function(t,e,r){t[e]=r.value},i="function"==typeof Symbol?Symbol:{},a=i.iterator||"@@iterator",c=i.asyncIterator||"@@asyncIterator",s=i.toStringTag||"@@toStringTag";function f(t,e,r){return Object.defineProperty(t,e,{value:r,enumerable:!0,configurable:!0,writable:!0}),t[e]}try{f({},"")}catch(t){f=function(t,e,r){return t[e]=r}}function l(t,e,r,n){var i=e&&e.prototype instanceof b?e:b,a=Object.create(i.prototype),c=new N(n||[]);return o(a,"_invoke",{value:E(t,r,c)}),a}function p(t,e,r){try{return{type:"normal",arg:t.call(e,r)}}catch(t){return{type:"throw",arg:t}}}e.wrap=l;var y="suspendedStart",v="executing",d="completed",w={};function b(){}function g(){}function m(){}var O={};f(O,a,(function(){return this}));var x=Object.getPrototypeOf,j=x&&x(x(T([])));j&&j!==r&&n.call(j,a)&&(O=j);var k=m.prototype=b.prototype=Object.create(O);function P(t){["next","throw","return"].forEach((function(e){f(t,e,(function(t){return this._invoke(e,t)}))}))}function S(t,e){function r(o,i,a,c){var s=p(t[o],t,i);if("throw"!==s.type){var f=s.arg,l=f.value;return l&&"object"==u(l)&&n.call(l,"__await")?e.resolve(l.__await).then((function(t){r("next",t,a,c)}),(function(t){r("throw",t,a,c)})):e.resolve(l).then((function(t){f.value=t,a(f)}),(function(t){return r("throw",t,a,c)}))}c(s.arg)}var i;o(this,"_invoke",{value:function(t,n){function o(){return new e((function(e,o){r(t,n,e,o)}))}return i=i?i.then(o,o):o()}})}function E(e,r,n){var o=y;return function(i,a){if(o===v)throw new Error("Generator is already running");if(o===d){if("throw"===i)throw a;return{value:t,done:!0}}for(n.method=i,n.arg=a;;){var c=n.delegate;if(c){var u=L(c,n);if(u){if(u===w)continue;return u}}if("next"===n.method)n.sent=n._sent=n.arg;else if("throw"===n.method){if(o===y)throw o=d,n.arg;n.dispatchException(n.arg)}else"return"===n.method&&n.abrupt("return",n.arg);o=v;var s=p(e,r,n);if("normal"===s.type){if(o=n.done?d:"suspendedYield",s.arg===w)continue;return{value:s.arg,done:n.done}}"throw"===s.type&&(o=d,n.method="throw",n.arg=s.arg)}}}function L(e,r){var n=r.method,o=e.iterator[n];if(o===t)return r.delegate=null,"throw"===n&&e.iterator.return&&(r.method="return",r.arg=t,L(e,r),"throw"===r.method)||"return"!==n&&(r.method="throw",r.arg=new TypeError("The iterator does not provide a '"+n+"' method")),w;var i=p(o,e.iterator,r.arg);if("throw"===i.type)return r.method="throw",r.arg=i.arg,r.delegate=null,w;var a=i.arg;return a?a.done?(r[e.resultName]=a.value,r.next=e.nextLoc,"return"!==r.method&&(r.method="next",r.arg=t),r.delegate=null,w):a:(r.method="throw",r.arg=new TypeError("iterator result is not an object"),r.delegate=null,w)}function _(t){var e={tryLoc:t[0]};1 in t&&(e.catchLoc=t[1]),2 in t&&(e.finallyLoc=t[2],e.afterLoc=t[3]),this.tryEntries.push(e)}function U(t){var e=t.completion||{};e.type="normal",delete e.arg,t.completion=e}function N(t){this.tryEntries=[{tryLoc:"root"}],t.forEach(_,this),this.reset(!0)}function T(e){if(e||""===e){var r=e[a];if(r)return r.call(e);if("function"==typeof e.next)return e;if(!isNaN(e.length)){var o=-1,i=function r(){for(;++o<e.length;)if(n.call(e,o))return r.value=e[o],r.done=!1,r;return r.value=t,r.done=!0,r};return i.next=i}}throw new TypeError(u(e)+" is not iterable")}return g.prototype=m,o(k,"constructor",{value:m,configurable:!0}),o(m,"constructor",{value:g,configurable:!0}),g.displayName=f(m,s,"GeneratorFunction"),e.isGeneratorFunction=function(t){var e="function"==typeof t&&t.constructor;return!!e&&(e===g||"GeneratorFunction"===(e.displayName||e.name))},e.mark=function(t){return Object.setPrototypeOf?Object.setPrototypeOf(t,m):(t.__proto__=m,f(t,s,"GeneratorFunction")),t.prototype=Object.create(k),t},e.awrap=function(t){return{__await:t}},P(S.prototype),f(S.prototype,c,(function(){return this})),e.AsyncIterator=S,e.async=function(t,r,n,o,i){void 0===i&&(i=Promise);var a=new S(l(t,r,n,o),i);return e.isGeneratorFunction(r)?a:a.next().then((function(t){return t.done?t.value:a.next()}))},P(k),f(k,s,"Generator"),f(k,a,(function(){return this})),f(k,"toString",(function(){return"[object Generator]"})),e.keys=function(t){var e=Object(t),r=[];for(var n in e)r.push(n);return r.reverse(),function t(){for(;r.length;){var n=r.pop();if(n in e)return t.value=n,t.done=!1,t}return t.done=!0,t}},e.values=T,N.prototype={constructor:N,reset:function(e){if(this.prev=0,this.next=0,this.sent=this._sent=t,this.done=!1,this.delegate=null,this.method="next",this.arg=t,this.tryEntries.forEach(U),!e)for(var r in this)"t"===r.charAt(0)&&n.call(this,r)&&!isNaN(+r.slice(1))&&(this[r]=t)},stop:function(){this.done=!0;var t=this.tryEntries[0].completion;if("throw"===t.type)throw t.arg;return this.rval},dispatchException:function(e){if(this.done)throw e;var r=this;function o(n,o){return c.type="throw",c.arg=e,r.next=n,o&&(r.method="next",r.arg=t),!!o}for(var i=this.tryEntries.length-1;i>=0;--i){var a=this.tryEntries[i],c=a.completion;if("root"===a.tryLoc)return o("end");if(a.tryLoc<=this.prev){var u=n.call(a,"catchLoc"),s=n.call(a,"finallyLoc");if(u&&s){if(this.prev<a.catchLoc)return o(a.catchLoc,!0);if(this.prev<a.finallyLoc)return o(a.finallyLoc)}else if(u){if(this.prev<a.catchLoc)return o(a.catchLoc,!0)}else{if(!s)throw new Error("try statement without catch or finally");if(this.prev<a.finallyLoc)return o(a.finallyLoc)}}}},abrupt:function(t,e){for(var r=this.tryEntries.length-1;r>=0;--r){var o=this.tryEntries[r];if(o.tryLoc<=this.prev&&n.call(o,"finallyLoc")&&this.prev<o.finallyLoc){var i=o;break}}i&&("break"===t||"continue"===t)&&i.tryLoc<=e&&e<=i.finallyLoc&&(i=null);var a=i?i.completion:{};return a.type=t,a.arg=e,i?(this.method="next",this.next=i.finallyLoc,w):this.complete(a)},complete:function(t,e){if("throw"===t.type)throw t.arg;return"break"===t.type||"continue"===t.type?this.next=t.arg:"return"===t.type?(this.rval=this.arg=t.arg,this.method="return",this.next="end"):"normal"===t.type&&e&&(this.next=e),w},finish:function(t){for(var e=this.tryEntries.length-1;e>=0;--e){var r=this.tryEntries[e];if(r.finallyLoc===t)return this.complete(r.completion,r.afterLoc),U(r),w}},catch:function(t){for(var e=this.tryEntries.length-1;e>=0;--e){var r=this.tryEntries[e];if(r.tryLoc===t){var n=r.completion;if("throw"===n.type){var o=n.arg;U(r)}return o}}throw new Error("illegal catch attempt")},delegateYield:function(e,r,n){return this.delegate={iterator:T(e),resultName:r,nextLoc:n},"next"===this.method&&(this.arg=t),w}},e}function p(t,e,r,n,o,i,a){try{var c=t[i](a),u=c.value}catch(t){return void r(t)}c.done?e(u):Promise.resolve(u).then(n,o)}function y(t){return function(){var e=this,r=arguments;return new Promise((function(n,o){var i=t.apply(e,r);function a(t){p(i,n,o,a,c,"next",t)}function c(t){p(i,n,o,a,c,"throw",t)}a(void 0)}))}}function v(t,e){for(var r=0;r<e.length;r++){var n=e[r];n.enumerable=n.enumerable||!1,n.configurable=!0,"value"in n&&(n.writable=!0),Object.defineProperty(t,x(n.key),n)}}function d(t,e){return(d=Object.setPrototypeOf?Object.setPrototypeOf.bind():function(t,e){return t.__proto__=e,t})(t,e)}function w(t){var e=function(){if("undefined"==typeof Reflect||!Reflect.construct)return!1;if(Reflect.construct.sham)return!1;if("function"==typeof Proxy)return!0;try{return Boolean.prototype.valueOf.call(Reflect.construct(Boolean,[],(function(){}))),!0}catch(t){return!1}}();return function(){var r,n=m(t);if(e){var o=m(this).constructor;r=Reflect.construct(n,arguments,o)}else r=n.apply(this,arguments);return b(this,r)}}function b(t,e){if(e&&("object"===u(e)||"function"==typeof e))return e;if(void 0!==e)throw new TypeError("Derived constructors may only return object or undefined");return g(t)}function g(t){if(void 0===t)throw new ReferenceError("this hasn't been initialised - super() hasn't been called");return t}function m(t){return(m=Object.setPrototypeOf?Object.getPrototypeOf.bind():function(t){return t.__proto__||Object.getPrototypeOf(t)})(t)}function O(t,e,r){return(e=x(e))in t?Object.defineProperty(t,e,{value:r,enumerable:!0,configurable:!0,writable:!0}):t[e]=r,t}function x(t){var e=function(t,e){if("object"!==u(t)||null===t)return t;var r=t[Symbol.toPrimitive];if(void 0!==r){var n=r.call(t,e||"default");if("object"!==u(n))return n;throw new TypeError("@@toPrimitive must return a primitive value.")}return("string"===e?String:Number)(t)}(t,"string");return"symbol"===u(e)?e:String(e)}var j=function(t,e){return function(r){!function(t,e){if("function"!=typeof e&&null!==e)throw new TypeError("Super expression must either be null or a function");t.prototype=Object.create(e&&e.prototype,{constructor:{value:t,writable:!0,configurable:!0}}),Object.defineProperty(t,"prototype",{writable:!1}),e&&d(t,e)}(j,r);var n,u,f,p,b,m,x=w(j);function j(t){var e;return function(t,e){if(!(t instanceof e))throw new TypeError("Cannot call a class as a function")}(this,j),O(g(e=x.call(this,t)),"valid",function(){var t=y(h().mark((function t(e){return h().wrap((function(t){for(;;)switch(t.prev=t.next){case 0:return t.next=2,Object(c.e)(e.ticket);case 2:return t.abrupt("return",t.sent);case 3:case"end":return t.stop()}}),t)})));return function(e){return t.apply(this,arguments)}}()),O(g(e),"onUserPath",(function(t,r,n){var o=/(http|https):\/\/([\w.]+\/?)\S*/,i=e.props.location;if(t.authType)return-1!==t.appName.indexOf("eas")&&n.redirect&&o.test(n.redirect)?window.location.href="".concat(window.location.origin,"/#/login?redirect=").concat(n.redirect):r.push({pathname:"/logout",state:{preRoute:i.pathname}});if(o.test(t.authServiceUrl)){return window.location.href="".concat(t.authServiceUrl,"?redirect=").concat(window.location.origin+"/#"+i.pathname)}return r.push("/login")})),O(g(e),"getProjectAuthentication",y(h().mark((function t(){var r;return h().wrap((function(t){for(;;)switch(t.prev=t.next){case 0:return t.next=2,Object(c.a)();case 2:if((r=t.sent).code){t.next=7;break}return localStorage.setItem(i.LOCALSTORAGE_KEY.AUTH_CONFIG,JSON.stringify(r.data)),e.setState({authData:r.data}),t.abrupt("return",r.data);case 7:case"end":return t.stop()}}),t)})))),O(g(e),"getVersion",y(h().mark((function t(){return h().wrap((function(t){for(;;)switch(t.prev=t.next){case 0:return t.next=2,Object(c.f)().then((function(t){0===t.code&&e.setState({versionInfo:t.data&&t.data})}));case 2:case"end":return t.stop()}}),t)})))),e.state={loading:!0,authData:{},versionInfo:{}},e}return n=j,(u=[{key:"componentDidMount",value:(m=y(h().mark((function t(){return h().wrap((function(t){for(;;)switch(t.prev=t.next){case 0:return t.next=2,this.getVersion();case 2:return t.next=4,this.handelVerUser(this.props);case 4:case"end":return t.stop()}}),t,this)}))),function(){return m.apply(this,arguments)})},{key:"shouldComponentUpdate",value:(b=y(h().mark((function t(e,r,n){var o;return h().wrap((function(t){for(;;)switch(t.prev=t.next){case 0:if(o=this.props.pluginStore,!Array.isArray(o)){t.next=6;break}if(e.pluginStore.length===o.length){t.next=6;break}return t.next=5,this.handelVerUser(e);case 5:return t.abrupt("return",!0);case 6:return t.abrupt("return",!1);case 7:case"end":return t.stop()}}),t,this)}))),function(t,e,r){return b.apply(this,arguments)})},{key:"componentWillUnmount",value:function(){console.log("组件即将卸载======verifyUserHoc")}},{key:"handelVerUser",value:(p=y(h().mark((function t(r){var n,o,u,s=this;return h().wrap((function(t){for(;;)switch(t.prev=t.next){case 0:return n=r.history,o=r.pluginStore,u=Object(i.urlQuery)(window.location.search||window.location.href),t.prev=2,t.next=5,Object(a.remoteFunction)("verifyWechat",o,{},"getWechatAuthUrl");case 5:t.next=10;break;case 7:t.prev=7,t.t0=t.catch(2),console.error(t.t0.data,"插件企业微信认证url方法保存");case 10:this.getProjectAuthentication().then(function(){var t=y(h().mark((function t(r){var f;return h().wrap((function(t){for(;;)switch(t.prev=t.next){case 0:return t.prev=0,t.next=3,Object(a.remoteFunction)("verifyWechat",o,u,"authWechatLogin");case 3:t.next=7;break;case 5:t.prev=5,t.t0=t.catch(0);case 7:if(!u.ticket){t.next=11;break}Object(c.e)(u.ticket).then(function(){var t=y(h().mark((function t(r){var o;return h().wrap((function(t){for(;;)switch(t.prev=t.next){case 0:return localStorage.removeItem("redirect"),t.next=3,Object(c.i)(r.data.userId);case 3:if(0!==(o=t.sent).code||!o.data){t.next=9;break}Object(i.saveUser)(l(l({},r.data),u)),s.setState({loading:!1},(function(){return/mobile.html/.test(window.location.pathname)?window.location.href=window.location.origin+"/mobile.html#/?"+Object(i.parseUserSearchParams)({ticket:u.ticket}):location.pathname.includes("eas")?window.location.href=window.location.origin+"".concat(window.location.pathname,"#").concat(n.location.pathname,"?").concat(Object(i.parseUserSearchParams)({ticket:u.ticket}))+n.location.pathname:window.location.href=window.location.origin+"/#"+n.location.pathname})),t.next=10;break;case 9:return t.abrupt("return",n.push(e));case 10:case"end":return t.stop()}}),t)})));return function(e){return t.apply(this,arguments)}}()),t.next=28;break;case 11:if(Object(i.getUser)().ticket){t.next=23;break}t.prev=12,t.next=15;break;case 15:s.onUserPath(r,n,u),t.next=21;break;case 18:t.prev=18,t.t1=t.catch(12),s.onUserPath(r,n,u);case 21:t.next=28;break;case 23:if(f=/(http|https):\/\/([\w.]+\/?)\S*/,-1===r.appName.indexOf("eas")||!u.redirect||!f.test(u.redirect)){t.next=27;break}return t.abrupt("return",window.location.href="".concat(u.redirect,"?").concat(Object(i.parseUserSearchParams)({ticket:Object(i.getUser)().ticket})));case 27:s.setState({loading:!1});case 28:case"end":return t.stop()}}),t,null,[[0,5],[12,18]])})));return function(e){return t.apply(this,arguments)}}());case 11:case"end":return t.stop()}}),t,this,[[2,7]])}))),function(t){return p.apply(this,arguments)})},{key:"render",value:function(){return this.state.loading?"加载中":o.a.createElement(t,s({},this.props,{authData:this.state.authData}))}}])&&v(n.prototype,u),f&&v(n,f),Object.defineProperty(n,"prototype",{writable:!1}),j}(n.Component)};e.a=j}}]);