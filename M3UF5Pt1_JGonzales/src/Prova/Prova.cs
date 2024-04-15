using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Semana_06._2
{
    public partial class Form1 : Form
    {
        public Form1(){
            InitializeComponent();
        }

        private void BtnCalcular_Click(object sender, EventArgs e){
            Calcular();
        }

        private void Calcular(){
            String Nombres = "", Mensaje = "";
            float Estatura, IMC, Peso;

            Peso = float.Parse(TxtPeso.Text);
            Estatura = float.Parse(TxtAltura.Text);
            IMC = float.Parse(Peso / (Estatura * Estatura));

            if (IMC < 18.5){
                Mensaje = "Bajo Peso";
            }else if (IMC >= 18.5 && IMC < 24.9){
                Mensaje = "Peso Normal";
            }else if (IMC >= 25 && IMC < 29.9){
                Mensaje = "SobrePeso";
            }else if (IMC >= 30 && IMC < 34.5){
                Mensaje = "Obesidad Grado I";
            }else if (IMC >= 35 && IMC < 39.9){
                Mensaje = "Obesidad Grado II";
            }else if (IMC > 40){
                Mensaje = "Obesidad Grado III";
            }

            LblIMC.Text = Mensaje;
        }

        private void btnNuevo_Click(object sender, EventArgs e){
            TxtNombres.Clear();TxtNombres.Focus();
            TxtPeso.Clear();
            TxtAltura.Clear();
            LblIMC.Text = "";
            TxtMensaje.Clear();
        }
    }
}