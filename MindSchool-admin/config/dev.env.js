'use strict'
const merge = require('webpack-merge')
const prodEnv = require('./prod.env')

module.exports = merge(prodEnv, {
  NODE_ENV: '"development"',
  // nginx
  // BASE_API: '"http://192.168.1.13:9001"',
  // 网关 
  BASE_API: '"http://localhost:8222"',
})
