from flask import render_template
from app import app

@app.route('/todo/create')
def createTodoItem():
    return render_template('createItem.html', name="niu")
