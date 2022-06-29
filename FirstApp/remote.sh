 #!/bin/sh
 ssh -i /home/minh.pem ec2-user@3.101.107.249 'touch a.txt'


scp -oStrictHostKeyChecking=no -r -i openssh.pem test.txt root@3.101.107.249:/home/