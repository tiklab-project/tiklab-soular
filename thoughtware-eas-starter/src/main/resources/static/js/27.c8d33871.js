(window.webpackJsonp=window.webpackJsonp||[]).push([[27],{574:function(t,n,r){"use strict";r.d(n,"a",(function(){return i})),r.d(n,"b",(function(){return d})),r.d(n,"c",(function(){return v}));var e,o=r(0),s=(e=function(t,n){return(e=Object.setPrototypeOf||{__proto__:[]}instanceof Array&&function(t,n){t.__proto__=n}||function(t,n){for(var r in n)n.hasOwnProperty(r)&&(t[r]=n[r])})(t,n)},function(t,n){function r(){this.constructor=t}e(t,n),t.prototype=null===n?Object.create(n):(r.prototype=n.prototype,new r)}),u=o.createContext(null),i=function(t){function n(){return null!==t&&t.apply(this,arguments)||this}return s(n,t),n.prototype.render=function(){return o.createElement(u.Provider,{value:this.props.store},this.props.children)},n}(o.Component),c=r(222),a=r.n(c),p=r(223),f=r.n(p),b=function(){var t=function(n,r){return(t=Object.setPrototypeOf||{__proto__:[]}instanceof Array&&function(t,n){t.__proto__=n}||function(t,n){for(var r in n)n.hasOwnProperty(r)&&(t[r]=n[r])})(n,r)};return function(n,r){function e(){this.constructor=n}t(n,r),n.prototype=null===r?Object.create(r):(e.prototype=r.prototype,new e)}}(),h=function(){return(h=Object.assign||function(t){for(var n,r=1,e=arguments.length;r<e;r++)for(var o in n=arguments[r])Object.prototype.hasOwnProperty.call(n,o)&&(t[o]=n[o]);return t}).apply(this,arguments)};var l=function(){return{}};function d(t,n){void 0===n&&(n={});var r=!!t,e=t||l;return function(s){var i=function(n){function i(t,r){var o=n.call(this,t,r)||this;return o.unsubscribe=null,o.handleChange=function(){if(o.unsubscribe){var t=e(o.store.getState(),o.props);o.setState({subscribed:t})}},o.store=o.context,o.state={subscribed:e(o.store.getState(),t),store:o.store,props:t},o}return b(i,n),i.getDerivedStateFromProps=function(n,r){return t&&2===t.length&&n!==r.props?{subscribed:e(r.store.getState(),n),props:n}:{props:n}},i.prototype.componentDidMount=function(){this.trySubscribe()},i.prototype.componentWillUnmount=function(){this.tryUnsubscribe()},i.prototype.shouldComponentUpdate=function(t,n){return!a()(this.props,t)||!a()(this.state.subscribed,n.subscribed)},i.prototype.trySubscribe=function(){r&&(this.unsubscribe=this.store.subscribe(this.handleChange),this.handleChange())},i.prototype.tryUnsubscribe=function(){this.unsubscribe&&(this.unsubscribe(),this.unsubscribe=null)},i.prototype.render=function(){var t=h(h(h({},this.props),this.state.subscribed),{store:this.store});return o.createElement(s,h({},t,{ref:this.props.miniStoreForwardedRef}))},i.displayName="Connect("+function(t){return t.displayName||t.name||"Component"}(s)+")",i.contextType=u,i}(o.Component);if(n.forwardRef){var c=o.forwardRef((function(t,n){return o.createElement(i,h({},t,{miniStoreForwardedRef:n}))}));return f()(c,s)}return f()(i,s)}}var y=function(){return(y=Object.assign||function(t){for(var n,r=1,e=arguments.length;r<e;r++)for(var o in n=arguments[r])Object.prototype.hasOwnProperty.call(n,o)&&(t[o]=n[o]);return t}).apply(this,arguments)};function v(t){var n=t,r=[];return{setState:function(t){n=y(y({},n),t);for(var e=0;e<r.length;e++)r[e]()},getState:function(){return n},subscribe:function(t){return r.push(t),function(){var n=r.indexOf(t);r.splice(n,1)}}}}},605:function(t,n,r){var e={"./es":584,"./es-do":585,"./es-do.js":585,"./es-mx":586,"./es-mx.js":586,"./es-us":587,"./es-us.js":587,"./es.js":584,"./zh-cn":588,"./zh-cn.js":588};function o(t){var n=s(t);return r(n)}function s(t){if(!r.o(e,t)){var n=new Error("Cannot find module '"+t+"'");throw n.code="MODULE_NOT_FOUND",n}return e[t]}o.keys=function(){return Object.keys(e)},o.resolve=s,t.exports=o,o.id=605},805:function(t,n,r){"use strict";r.r(n);r(760);var e=r(776),o=r(0),s=r.n(o);function u(){return(u=Object.assign?Object.assign.bind():function(t){for(var n=1;n<arguments.length;n++){var r=arguments[n];for(var e in r)Object.prototype.hasOwnProperty.call(r,e)&&(t[e]=r[e])}return t}).apply(this,arguments)}n.default=function(t){return s.a.createElement(e.a,u({},t,{bgroup:"eas",__source:{fileName:"/Users/gaomengyuan/thoughtware/thoughtware-eas-ui/src/setting/base/message/MyTodoTask.js",lineNumber:12,columnNumber:12}}))}}}]);