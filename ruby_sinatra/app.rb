require 'rubygems'
require 'bundler'
require 'sinatra'

require_relative 'models/post'

set :public_folder=> File.dirname(__FILE__) + '/static'

get '/' do
  'Hello world!'
end

get '/posts' do
  @posts = Post.all()
  erb :posts
end

get '/post/create' do
  erb :create_post
end

post '/post/create' do
  post=Post.create(:title => params[:title], :body => params[:body], :created_at => Time.now)
  redirect '/posts'
end