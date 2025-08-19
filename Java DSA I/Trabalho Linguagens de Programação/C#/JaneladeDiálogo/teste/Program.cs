using System;
using System.Windows.Forms;

class Program
{
    static void Main()
    {
        // Exibir uma mensagem de informa��o
        MessageBox.Show("Ol�, mundo!", "Mensagem");

        // Exibir uma mensagem de confirma��o
        DialogResult result = MessageBox.Show("Voc� quer continuar?",
            "Confirma��o", MessageBoxButtons.YesNo);

        if (result == DialogResult.Yes)
        {
            MessageBox.Show("Usu�rio escolheu sim.");
        }
        else
        {
            MessageBox.Show("Usu�rio escolheu n�o.");
        }
    }
}