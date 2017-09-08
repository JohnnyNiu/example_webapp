import os
basedir = os.path.abspath(os.path.dirname(__file__))

#this is required by flask-sqlalchemy extention
SQLALCHEMY_DATABASE_URI = 'sqlite:///' + os.path.join(basedir, 'app.db')