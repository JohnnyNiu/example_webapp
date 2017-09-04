from flask import request, render_template
from app import app

@app.route('/todo/create', methods=['GET'])
def createTodoItemForm():
    return render_template('createItem.html', name="niu")

@app.route('/todo/create', methods=['POST'])
def createTodoItem():
    return request.form['content']
