private void sendMessage() {
        tfMessage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                log.append(tfMessage.getText()+ "\n");
                tfMessage.setText(""); // clearing the field tfMessage
            }
        });
    }