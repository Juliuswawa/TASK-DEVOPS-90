provider "aws" {
region = "us-east-1"
 access_key = "AKIAZOBXTZKRPQRAEP77"
  secret_key = "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"
}

resource "aws_instance" "server" {
  ami           = "ami-052efd3df9dad4825"
  instance_type = "t2.micro"
  count = 1
  tags = {
    Name = "ubuntu"
  }
}

 poll change
